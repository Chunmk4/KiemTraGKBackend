package com.example.thigk.bai4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling", "Bloomsbury");
        System.out.println(book.getInfo());

        FictionBook fictionBook = new FictionBook("Book1", "Chung", "Chung", "Fantasy");
        System.out.println(fictionBook.getInfo());

        NonFictionBook nonFictionBook = new NonFictionBook("Book2", "Chung2", "Chung3", "Life");
        System.out.println(nonFictionBook.getInfo());

        ScienceBook scienceBook = new ScienceBook("Book3", "Chung3", "Chung3", "Cosmology");
        System.out.println(scienceBook.getInfo());
    }

}
