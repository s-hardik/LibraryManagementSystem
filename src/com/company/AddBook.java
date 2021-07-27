package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddBook {
    public List addBook() {
        int max = 500;
        int min = 200;
        Scanner scan = new Scanner(System.in);
        Book.bookList.add(new Book((int)(Math.random()*(max-min+1)+min),scan.next(),scan.next(),scan.nextInt(),scan.nextInt()));
        return Book.bookList;
    }
}
