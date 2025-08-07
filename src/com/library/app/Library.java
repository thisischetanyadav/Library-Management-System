package com.library.app;
import java.util.ArrayList;
import java.util.List;


public class Library {
	


	
		
		private List<Book> books;
		private List<User> users;

		public Library() {
			books = new ArrayList<>();
			users = new ArrayList<>();
		}

		public void addBook(Book book) {
			books.add(book);
		}

		public void registerUser(User user) {
			users.add(user);
		}

		public Book findBook(String title) {
			for (Book book : books) {
				if (book.getTitle().equalsIgnoreCase(title)) {
					return book;
				}
			}
			return null;
		}

		public User findUser(int id) {
			for (User user : users) {
				if (user.getId() == id) {
					return user;
				}
			}
			return null;
		}

		public void displayBooks() {
			System.out.println("\nAvailable Books:");
			for (Book book : books) {
				System.out.println(book);
			}
		}
	}


