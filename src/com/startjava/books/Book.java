package com.startjava.books;

public class Book {
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

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", name='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
