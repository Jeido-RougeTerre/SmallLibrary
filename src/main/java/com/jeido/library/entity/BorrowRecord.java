package com.jeido.library.entity;

import com.jeido.library.repository.Library;

import java.util.*;

public record BorrowRecord(int itemId, String borrowerName, String borrowDate) {
    private static final Map<LibraryItem, BorrowRecord> borrowedItems = new HashMap<>();

    public BorrowRecord(int itemId, String borrowerName, String borrowDate) {
        this.itemId = itemId;
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
        LibraryItem borrowedItem = Library.getLibraryItem(itemId);
        if (borrowedItem != null) {
            borrowedItems.put(borrowedItem, this);
        }
    }

    @Override
    public String toString() {
        return String.format("BorrowRecord[itemId=%d, borrowerName=%s, borrowDate=%s]", itemId, borrowerName, borrowDate);
    }

    public static List<LibraryItem> getBorrowedItems() {
        return new ArrayList<>(borrowedItems.keySet());
    }
}
