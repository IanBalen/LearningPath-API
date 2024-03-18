package com.api.test.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Service
public class ReviewService {

    private final Random random = new Random();
    private int counter = 0;


    public ResponseEntity<Double> getReview(Long id) {

        counter++;

        if(counter % 3 == 0) {
            throw new RuntimeException("Error occurred while getting a review for id: " + id);
        }

        System.out.println("Getting review for id: " + id);

        // Generating a random double between 2 and 5
        double randomValue = 2 + (5 - 2) * random.nextDouble();

        // Rounding to 2 decimal places
        BigDecimal bd = new BigDecimal(Double.toString(randomValue));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedValue = bd.doubleValue();

        return ResponseEntity.ok(roundedValue);
    }
}
