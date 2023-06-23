package com.startjava.books;

public class Book extends Closet{

    private String autor;
    private String title;
    private int year;
    private int length;

    public Book(String autor, String title, int year) {
        this.autor = autor;
        this.title = title;
        this.year = year;
        this.length = autor.length() + title.length() + Integer.toString(year).length();
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return autor + ", " + title + ", " + year;
    }
}
