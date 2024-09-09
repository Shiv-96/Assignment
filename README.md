# Assignment

# Coding Challenge: Product API & CSV Formula Evaluation

## Overview

This project consists of three tasks that involve interacting with FakeStoreAPI for product-related operations and evaluating a CSV file with formulas similar to an Excel sheet. The goal is to create APIs and logic to retrieve product details by category, add new products, and process a CSV file to calculate values from given formulas.

## Tasks

### Task 1: List Product Details by Category

- **Objective**: Create an API endpoint that retrieves a list of products based on a category input parameter.
- **API Reference**: 
  - Method: `GET`
  - URL: `/products/category/{category}`
  - Example: `https://localhost:8080/products/category/jewelery`
- **Input**: The category as a parameter (e.g., electronics, jewelry, etc.).
- **Output**: A list of products within the specified category, including details such as title, price, and description.

### Task 2: Add a New Product Entry

- **Objective**: Create an API endpoint that allows the addition of a new product with relevant properties such as title, price, description, and category.
- **API Reference**: 
  - Method: `POST`
  - URL: `/products`
  - Example: `https://localhost:8080/products`
- **Input**: JSON object containing the product properties (title, price, description, etc.).
- **Output**: A response confirming the product creation and the details of the created product.

### Task 3: CSV Formula Evaluation

- **Objective**: Write a program that takes a CSV file with a mix of values and formulas, calculates the results of any formulas, and outputs a CSV file with the final computed values.
- **API Reference**: 
  - Method: `GET`
  - URL: `/process`
  - Example: `https://localhost:8080/process`
- **Input**: CSV file containing values and formulas, similar to an Excel sheet. Example CSV:
  
  |  | A | B | C |
  | --- | --- | --- | --- |
  | 1 | 5 | 3 | =5+A1 |
  | 2 | 7 | 8 | =A2+B2 |
  | 3 | 9 | =4+5 | =C2+B3 |
  
  - In this example, `A1`, `A2`, `A3` `B1` and `B2`  are values. Columns `B3`, `C1`, `C2`, and `C3` contain formulas.
  
- **Output**: A CSV file where all formulas are evaluated and replaced with their calculated values.
  
  Example output for the above CSV:
  
  |  | A | B | C |
  | --- | --- | --- | --- |
  | 1 | 5 | 3 | 10 |
  | 2 | 7 | 8 | 15 |
  | 3 | 9 | 9 | 24 |

- **Formula Rules**:
  - Basic addition must be supported.

  
## How to Run

### Task 1 & Task 2

1. Clone this repository and go to the folder called Practice:
   ```bash
   git clone https://github.com/Shiv-96/Assignment.git
   cd practice

### Task 3

1. Clone this repository and go to the folder called csvCalculator
      ```bash
   git clone https://github.com/Shiv-96/Assignment.git
   cd csvCalculator
