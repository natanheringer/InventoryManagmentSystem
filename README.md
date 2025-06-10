# Inventory Console Application

A simple Java console application for registering products, managing stock (add/remove units), and listing all products with an auto-increment ID.  
This project is designed as a learning exercise focusing on:

- Basic object-oriented design (Product entity + Program driver)  
- Collections (`ArrayList`)  
- Console input/output with `Scanner`  
- Formatted output (`printf`, `String.format`)  
- Static fields for global counters (auto-generated IDs)  

---

## Features

| Feature           | Description                                             |
|-------------------|---------------------------------------------------------|
| Auto-increment ID | Each new `Product` instance receives a unique sequential ID using a static counter. |
| Stock operations  | Add or remove units; total value in stock updates automatically. |
| Formatted summary | Products are printed in a table-like line:  
`| ID: 3 | Name: Mouse | $50.00 | 12 units | Total: $600.00 |` |
| Loop until exit   | Program prompts for new products until user chooses to exit. |
| In-memory list    | All products entered during the session are stored in a `List<Product>` and displayed at the end. |

---

## Requirements

- Java 17 or later (any recent JDK works)  
- No external libraries  

---

## Project Structure

/System
├─ /Application
  │ └─ Program.java # Entry-point with main loop
└─ /Entities
  └─ Product.java # Data class with business logic


---
