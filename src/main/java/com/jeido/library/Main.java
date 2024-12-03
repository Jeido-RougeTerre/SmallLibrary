package com.jeido.library;

import com.jeido.library.entity.Book;
import com.jeido.library.entity.BorrowRecord;
import com.jeido.library.entity.LibraryItem;
import com.jeido.library.entity.Magazine;
import com.jeido.library.repository.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adding elements to the library");
        Book efJava = new Book("Effective Java", 2018, "Joshua Bloch", "Programming");
        Magazine natGeo = new Magazine("National Geographic", 2023, 42);
        Library.addLibraryItem(efJava);
        Library.addLibraryItem(natGeo);

        System.out.println("List of available elements:");
        List<LibraryItem> allItems = Library.getItems();
        allItems.forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));

        System.out.println("Borrowing an Element...");
        BorrowRecord borrowRecord = new BorrowRecord(1, "John Doe", "2024-12-01");

        System.out.println(borrowRecord);

        System.out.println("Borrowed elements:");
        List<LibraryItem> borrowedItems = BorrowRecord.getBorrowedItems();
        borrowedItems.forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));

        System.out.println("List of available elements:");
        List<LibraryItem> availableItems = Library.getItems();
        availableItems.removeAll(borrowedItems);
        availableItems.forEach(libraryItem -> System.out.println("- " + libraryItem.getDetails()));
    }
}