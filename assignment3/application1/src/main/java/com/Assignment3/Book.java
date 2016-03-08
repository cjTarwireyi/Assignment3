package com.Assignment3;

/**
 * 214051471 CJ Tarwireyi
 * This is a demo of sets
 */
public class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String title,String author){
        bookTitle=title;
        bookAuthor=author;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
    public String toString(){
        return bookTitle+"     "+bookAuthor+"\n";
    }
}
