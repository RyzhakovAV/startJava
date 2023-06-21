package com.startjava.books;

public class Closet {
    private int countBooks = 0;
    private int sizeCloset = 10;
    public Book[] arrayCloset = new Book[sizeCloset];

    public void add(Book book) {
        if(countBooks < sizeCloset) {
            arrayCloset[countBooks] = book;
        }
    }
}
