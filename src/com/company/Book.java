package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int bookId;
    private String bookName;
    private String autherName;
    private int price;
    private int quantity;
    static List<Book> bookList = new ArrayList<>();

    public Book(int bookId, String bookName, String autherName, int price, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.autherName = autherName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAutherName() {
        return autherName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return bookId+" " +bookName+" "+autherName+" "+price+" "+quantity;
    }
}
