package com.training.prog;
class Book {
    private String title;
    private String author;//hidden
    private double price;
    private final String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) { this.title = title; }//setter
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }

    public String getIsbn() { return isbn; }//getter

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("ISBN12345");
        b.setTitle("Java Essentials");
        b.setAuthor("John Doe");
        b.setPrice(499.99);
        b.displayBookInfo();
    }
}
