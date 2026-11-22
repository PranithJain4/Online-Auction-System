# 🏛️ Online Auction System

A robust, console-based Online Auction Management Application built in Core Java using Object-Oriented Programming (OOP) principles.

---

## 🌟 Key Features

- **User Authentication**: Secure registration and credential validation.
- **Auction Lifecycle Management**: Create listings, monitor active state, and safely close auctions.
- **Real-Time Bidding Engine**:
  - Enforces dynamic price increments.
  - Prevents sellers from bidding on their own listings.
  - Automatically records full chronological bid audit history.
- **Winner Determination**: Automatic declaration of the highest bidder and final winning hammer price upon closure.

---

## 🧩 OOP Concepts Applied

1. **Encapsulation & Data Hiding**:
   - Private fields across `User`, `Bid`, and `Auction` domain models.
   - The `password` field in `User` is fully shielded with no public getters/setters; validation is performed internally via `checkLogin()`.
2. **Composition & Aggregation (Has-A Relationship)**:
   - An `Auction` maintains an `ArrayList<Bid>` representing its complete bidding history.
3. **Abstraction**:
   - UI caller in `Main` executes high-level domain operations (`placeBid`, `closeAuction`, `showDetails`) without needing access to raw internal state structures.

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or higher)

### Compilation & Execution
```bash
# 1. Compile all Java source files
javac *.java

# 2. Run the application
java Main
```

---

## 🖥️ System Architecture & Workflow

```text
               +---------------------------+
               |         Main.java         |
               | (Console Driver & Menus)  |
               +-------------+-------------+
                             |
             +---------------+---------------+
             |                               |
             v                               v
    +-----------------+             +-----------------+
    |    User.java    |             |  Auction.java   |
    | (Encapsulation) |             |  (Domain Logic) |
    +-----------------+             +--------+--------+
                                             |
                                             v 1..*
                                    +-----------------+
                                    |    Bid.java     |
                                    | (Has-A / Bids)  |
                                    +-----------------+
```
