## Table of Contents
- [Introduction](#introduction)
- [Implemented Design Patterns](#implemented-design-patterns)
    - [Strategy Pattern](#strategy-pattern)
- [License](#license)

## Introduction
Design patterns are proven solutions to common design problems. They offer templates for how to solve software design issues effectively. This project is a growing resource aimed at developers who want to enhance their understanding of **object-oriented programming** and **design principles** using **Java**.

## Implemented Design Patterns
### 1. Strategy Pattern
**Definition**: The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable within a context object.
- **Use Case**: Simplifies switching between different payment methods without bloating your codebase with conditional logic.
- **Classes**:
    - `PaymentStrategy`: Interface defining the common method `processPayment(double amount)`.
    - `CreditCardPayment`, `PayPalPayment`, `BankTransferPayment`: Concrete strategies implementing `PaymentStrategy`.
    - `PaymentProcessor`: Context class that uses the `PaymentStrategy` interface.
- **Example Usage**:
```java
PaymentStrategy paymentMethod = new PayPalPayment();
PaymentProcessor processor = new PaymentProcessor(paymentMethod);
processor.processPayment(150.00);  // Processes payment via PayPal
```

#### Read more from my blog: [ [Design Patterns - How the Strategy Design Pattern Saves Your Sanity](https://medium.com/@farhatshahirzim) ]

## License
This project is released under the [MIT License](https://opensource.org/licenses/MIT). See the [LICENSE](https://github.com/zim0101/design-patterns/blob/master/LICENSE) file for more details.