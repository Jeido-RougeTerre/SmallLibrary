package com.jeido.library.repository;

import com.jeido.library.entity.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final List<LibraryItem> AVAILABLE_ITEMS = new ArrayList<>();
    private static final List<LibraryItem> BORROWED_ITEMS = new ArrayList<>();


    public static void addLibraryItem(LibraryItem item) {
        AVAILABLE_ITEMS.add(item);
    }

    public static void borrowLibraryItem(LibraryItem item) {
        if (!AVAILABLE_ITEMS.contains(item)) return;
        if (BORROWED_ITEMS.contains(item)) return;
        AVAILABLE_ITEMS.remove(item);
        BORROWED_ITEMS.add(item);
    }

    public static List<LibraryItem> getAvailableItems() {
        return AVAILABLE_ITEMS;
    }

    public static List<LibraryItem> getBorrowedItems() {
        return BORROWED_ITEMS;
    }

    public static LibraryItem getLibraryItem(int id) {
        for (LibraryItem item : AVAILABLE_ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }

        for (LibraryItem item : BORROWED_ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }
}
