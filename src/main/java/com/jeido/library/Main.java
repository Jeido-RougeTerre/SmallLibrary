package com.jeido.library;

import com.jeido.library.entity.Book;
import com.jeido.library.entity.BorrowRecord;
import com.jeido.library.entity.Magazine;
import com.jeido.library.repository.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adding elements to the library");
        Book efJava = new Book("Effective Java", 2018, "Joshua Bloch", "Programming");
        Magazine natGeo = new Magazine("National Geographic", 2023, 42);
        Library.addLibraryItem(efJava);
        Library.addLibraryItem(natGeo);

        System.out.println("List of available elements:");
        Library.getAvailableItems().forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));

        System.out.println("Borrowing an Element...");
        BorrowRecord borrowRecord = new BorrowRecord(1, "John Doe", "2024-12-01");

        System.out.println(borrowRecord);

        System.out.println("Borrowed elements:");
        Library.getBorrowedItems().forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));

        System.out.println("List of available elements:");
        Library.getAvailableItems().forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));
    }
}