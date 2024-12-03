package com.jeido.library.entity;


public abstract class LibraryItem {
    private static int count = 1;

    private final int id;
    private final String title;
    private final int publicationYear;


    public LibraryItem(String title, int publicationYear) {
        this.id = count++;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public abstract String getDetails();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


}
