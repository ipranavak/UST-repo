package com.training.week1;

public class Book extends LibraryItem {
	int pages;
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Pages: "+pages);
	}
	Book(String title,String author,int pages){
		super(title,author);
		this.pages=pages;
	}

}
