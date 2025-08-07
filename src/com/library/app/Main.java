package com.library.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);

		// Sample data
		library.addBook(new Book("Java Basics", "John Doe"));
		library.addBook(new Book("OOP Concepts", "Jane Smith"));
		User user = new User("Alice", 1);
		library.registerUser(user);

		while (true) {
			System.out.println("\n==== Library Menu ====");
			System.out.println("1. Show all books");
			System.out.println("2. Issue a book");
			System.out.println("3. Return a book");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				library.displayBooks();
				break;

			case 2:
				System.out.print("Enter book title to issue: ");
				String title = scanner.nextLine();
				Book bookToIssue = library.findBook(title);
				if (bookToIssue != null && user.borrowBook(bookToIssue)) {
					System.out.println("Book issued successfully.");
				} else {
					System.out.println("Cannot issue the book. It might be already issued or you have one issued.");
				}
				break;

			case 3:
				if (user.returnBook()) {
					System.out.println("Book returned successfully.");
				} else {
					System.out.println("No book to return.");
				}
				break;

			case 4:
				System.out.println("Exiting system. Goodbye!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}
}