package com.startjava.books;

public class Closet {
    private static int countBooks = 0;
    private static int sizeCloset = 10;
    public Book[] arrayCloset = new Book[sizeCloset];

    public void add(Book book) {
        if(countBooks < sizeCloset) {
            arrayCloset[countBooks] = book;
            countBooks++;
        }
    }

    public void fillArray() {
        countBooks = 0;
    }

    public static int getCountBooks() {
        return countBooks;
    }

    public static int getSizeCloset() {
        return sizeCloset;
    }
}
