package com.hackerrank.practice.thirtyDaysOfCodes;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
    
    private String title;
    private String author;
    private int price;
    
    MyBook(String t, String a, int price) {
        super(t, a);
        this.title = t;
        this.author = a;
        this.price = price;
    }
    
    void setTitle(String title) {
        this.title = title;
    }
    
    String getTitle() {
        return title;
    }
    
    void setAuthor(String author) {
        this.author = author;
    }
    
    String getAuthor() {
        return author;
    }
    
    void setPrice(int price) {
        this.price = price;
    }
    
    int getPrice() {
        return price;
    }
    
    void display() {
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice());
    }
    
}

public class Day13 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

}
