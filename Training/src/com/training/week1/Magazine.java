package com.training.week1;

public class Magazine extends LibraryItem {
	String issueMonth;
	Magazine(String title,String author,String issueMonth){
		super(title,author);
		this.issueMonth=issueMonth;
	}
}
