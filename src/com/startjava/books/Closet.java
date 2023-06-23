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

    public void delete(String findBook) {
        int index = -1;
        for(int i = 0; i < countBooks; i++) {
            Book book = (Book) arrayCloset[i];
            if(book.getTitle().equals(findBook)) {
                index = i;
            }
        }
        if(index == -1) {
            System.out.println("Книга не найдена");
        }else if (index < countBooks && index != -1) {
            for(int i = index; i < countBooks; i++) {
                arrayCloset[i] = arrayCloset[i+1];
            }
        }
        countBooks--;
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
