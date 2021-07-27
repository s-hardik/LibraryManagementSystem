package com.company;

public class SearchBook {
    public String searchBook(String s) {
        String books="";
        for(int i=0;i<Book.bookList.size();i++){
            if(s.equalsIgnoreCase(Book.bookList.get(i).getBookName()))
            {
                books += Book.bookList.get(i).toString();
            }
            else if(s.equalsIgnoreCase(Book.bookList.get(i).getAutherName())){
                books += Book.bookList.get(i).toString();
            }
            else if(Book.bookList.get(i).getBookName().contains(s)
                    || Book.bookList.get(i).getAutherName().contains(s)){
                books += Book.bookList.get(i).toString();
            }
        }
        if(books==null||books==""){
            return "no books and auther found";
        }
        return books;
    }
}
