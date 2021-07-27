package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one option from below: " + "\n" +
                    "1. Add a Book" + "\n" +
                    "2. delete a Book" + "\n"
                    + "3. Show all book details"+"\n"
                    +"4. Manage Book Quantity"+ "\n"
            +"5. Quit");
            int option = scan.nextInt();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    System.out.println("Enter the book name to be removed: ");
                    delete(scan.next());
                    break;
                case 3:
                    showBookList();
                    break;
                case 4:
                    System.out.println("Enter the book name and new quantity: ");
                    manageBookQuantity(scan.next(),scan.nextInt());
                    break;
                case 5:
                    System.out.println("Enter the book name or Writter name: ");
                    searchforBook(scan.next());
                    break;
                case 6:
                    quit();
                    break;
                default:
                    System.out.println("Wrong Input selection");
            }
        }
    }

    private static void searchforBook(String s) {
        System.out.println(new SearchBook().searchBook(s));
    }

    private static void manageBookQuantity(String bookName, int quantity) {
      //System.out.println( new ManageBookQuantity().manageBookQuantity(bookName,quantity));//setting the new quantity  given by user
        System.out.println( new ManageBookQuantity().reducedQuantityBy(bookName,quantity));// reducing the amount of boook quantity by number given by user.
    }


    private static void quit() {
        System.out.println("Into quit method.");
        System.exit(0);
    }

    private static void delete(String bookName) {
        new DeleteBook().deleteBook(bookName);
        System.out.println("Into delete method");
    }

    private static void add() {
        System.out.println("Enter the Book details: ");
        new AddBook().addBook();
    }
    public static void showBookList(){
            System.out.println(Book.bookList);
    }
}
