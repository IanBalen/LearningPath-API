## Review API Demo

This endpoint is part of a learning module designed to help students understand how to interact with APIs. By using this endpoint, students can request a review score associated with a specific ID.

### How to Use:
- **HTTP Method**: GET
- **Endpoint:** `http://localhost:8081/api/review/{id}`
- **URL Path**: Replace `{id}` with the unique identifier for the review you wish to retrieve.

### Responses:

- **Success (200 OK)**: Returns a double value representing the review score. This score is a randomized number between 1.00 and 5.00, inclusive, rounded to two decimal places.
  
- **Error**: On certain occasions, the request will intentionally fail every third request to simulate real-world API behavior and error handling. The failure response includes:
  - An error message explaining the reason for the failure.
  - A status code (typically 500, indicating an internal server error).
  - A timestamp indicating when the error occurred.
