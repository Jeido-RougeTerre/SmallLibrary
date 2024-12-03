package com.jeido.library.repository;

import com.jeido.library.entity.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final List<LibraryItem> AVAILABLE_ITEMS = new ArrayList<>();
    private static final List<LibraryItem> BOROWED_ITEMS = new ArrayList<>();


    public static void addLibraryItem(LibraryItem item) {
        AVAILABLE_ITEMS.add(item);
    }

    public static void borrowLibraryItem(LibraryItem item) {
        if (!AVAILABLE_ITEMS.contains(item)) return;
        if (BOROWED_ITEMS.contains(item)) return;
        AVAILABLE_ITEMS.remove(item);
        BOROWED_ITEMS.add(item);
    }

    public static List<LibraryItem> getAvailableItems() {
        return AVAILABLE_ITEMS;
    }

    public static List<LibraryItem> getBorrowedItems() {
        return BOROWED_ITEMS;
    }

    public static LibraryItem getLibraryItem(int id) {
        for (LibraryItem item : AVAILABLE_ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }

        for (LibraryItem item : BOROWED_ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }
}
