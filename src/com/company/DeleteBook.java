package com.company;

import java.util.List;

public class DeleteBook {
    public List deleteBook(String bookName){
        for(int i=0; i<Book.bookList.size();i++){
            if(Book.bookList.get(i).getBookName().equals(bookName)){
                Book.bookList.remove(i);
            }
        }
        return Book.bookList;
    }
}
