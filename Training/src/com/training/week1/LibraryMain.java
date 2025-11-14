package com.training.week1;

public class LibraryMain {

	public static void main(String[] args) {
		Book b=new Book("Java", "Sachin", 500);
		b.displayInfo();
		Magazine m=new Magazine("Java", "Sachin", "May");
		m.displayInfo();

	}

}
