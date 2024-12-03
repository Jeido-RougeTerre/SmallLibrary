package com.jeido.library.repository;

import com.jeido.library.entity.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final List<LibraryItem> items = new ArrayList<>();

    public static void addLibraryItem(LibraryItem item) {
        items.add(item);
    }

    public static List<LibraryItem> getItems() {
        return items;
    }

    public static LibraryItem getLibraryItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
