package com.company;

import java.security.PublicKey;

public class ManageBookQuantity {
    public String manageBookQuantity(String bookname, int n) {
        for (int i = 0; i < Book.bookList.size(); i++) {
            if (Book.bookList.get(i).getBookName() != "") {
                    Book.bookList.get(i).setQuantity(n);
            }
        }
        return "quantity of book successfully updated.";
    }

    public String reducedQuantityBy(String bookname, int n) {
        for (int i = 0; i < Book.bookList.size(); i++) {
            if (Book.bookList.get(i).getBookName() != "") {
                if (n <= Book.bookList.get(i).getQuantity()) {
                    int actQuantity = Book.bookList.get(i).getQuantity();
                    Book.bookList.get(i).setQuantity(actQuantity - n);
                } else {
                    return "book quantity is less than the reduced amount given!!";
                }
            }

        }
        return "Book quantity is reduced by " + n;
    }
}