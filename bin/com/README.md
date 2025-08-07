# Library Management System (Java OOP Project)

A simple **Library Management System** built using **Java 8** and **OOP principles**. The system allows a registered user to view available books, issue a book, and return a book — all through a terminal interface.

---

##  Tools & Technologies Used

-  Language: **Java 8**
-  Paradigm: **Object-Oriented Programming (OOP)**
-  IDE: **Spring Tool Suite (STS)**
-  Interface: **Command-line (Terminal)**

---

##  OOP Concepts Applied

- **Encapsulation**
- **Abstraction**
- **Modular Design**
- **Class Responsibility Separation**

---

##  Features

-  View available books
-  Issue a book to a user
-  Return a book
-  Search for books by title
-  Single-user simulation (can be extended)

---

##  Project Structure

Library_Management_System/com.library.management.app/
│
├── Book.java # Represents a book (title, author, status)
├── User.java # Represents a user (borrow and return functionality)
├── Library.java # Core class to manage books and users
└── Main.java # Entry point with terminal-based menu


---

## How to Run the Project

### 1. Open the Project in STS
- Create a new Java project in STS.
- Add `Book.java`, `User.java`, `Library.java`, and `Main.java` under `src/com.library.management.app/`.

### 2. Compile and Run
- Right-click on `Main.java` → Run As → **Java Application**

Alternatively, you can compile and run via terminal:

```bash

    javac *.java
    java Main

---

##   Future Improvements

- Support for multiple users

- Save/load data from file or database

- Admin access to manage books

- GUI or web-based interface

---

## License

    This project is open-source and available under the MIT License.

---

## License

- Author
Name: Devrishi Jat

GitHub: Devrishi-jat