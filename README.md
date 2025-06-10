Inventory Console Application

A simple Java console application for registering products, managing stock (add/remove units), and listing all products with an auto-increment ID.
The project is intentionally kept minimal to serve as a learning exercise in:

basic object-oriented design (Product entity + Program driver)

collections (ArrayList)

console I/O with Scanner

formatted output (printf, String.format)

static fields for global counters (auto-generated IDs)

| Feature               | Description                                                                                   |       |             |         |          |                  |     |
| --------------------- | --------------------------------------------------------------------------------------------- | ----- | ----------- | ------- | -------- | ---------------- | --- |
| **Auto-increment ID** | Each new `Product` instance receives a unique sequential ID (`static int count`).             |       |             |         |          |                  |     |
| **Stock operations**  | Add or remove units; the total value in stock updates automatically.                          |       |             |         |          |                  |     |
| **Formatted summary** | Products are printed in a table-like line: \`                                                 | ID: 3 | Name: Mouse | \$50.00 | 12 units | Total: \$ 600.00 | \`. |
| **Loop until exit**   | The program keeps prompting for new products until the user presses **`n`**.                  |       |             |         |          |                  |     |
| **In-memory list**    | Every product entered during the session is stored in a `List<Product>` and shown at the end. |       |             |         |          |                  |     |

Requirements
Java 17 or later (any recent JDK works)

No external libraries

Project structure

/System
 ├─ /Application
 │   └─ Program.java    # entry-point (main loop)
 └─ /Entities
     └─ Product.java    # data class with business logic
