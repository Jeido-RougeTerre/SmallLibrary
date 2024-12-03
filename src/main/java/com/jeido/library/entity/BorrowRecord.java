package com.jeido.library.entity;

import com.jeido.library.repository.Library;

public record BorrowRecord(int itemId, String borrowerName, String borrowDate) {

    public BorrowRecord(int itemId, String borrowerName, String borrowDate) {
        this.itemId = itemId;
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
        Library.borrowLibraryItem(Library.getLibraryItem(itemId));

    }
}
