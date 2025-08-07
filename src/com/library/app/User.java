package com.library.app;


public class User {
	
	private String name;
	private int id;
	private Book borrowedBook;

	public User(String name, int id) {
		this.name = name;
		this.id = id;
		this.borrowedBook = null;
	}

	public boolean borrowBook(Book book) {
		if (book.isIssued() || borrowedBook != null) {
			return false;
		}
		borrowedBook = book;
		book.issue();
		return true;
	}

	public boolean returnBook() {
		if (borrowedBook == null)
			return false;
		borrowedBook.returnBook();
		borrowedBook = null;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}