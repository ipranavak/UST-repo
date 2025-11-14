package com.training.week1;

public class LibraryItem {
	LibraryItem(String title,String author){
		this.title=title;
		this.author=author;
	}
	String title;
	String author;
	void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}

}
