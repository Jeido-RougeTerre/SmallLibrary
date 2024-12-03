package com.jeido.library.entity;

public final class Book extends LibraryItem {
    private final String author;
    private final String genre;

    public Book(String title, int publicationYear, String author, String genre) {
        super(title, publicationYear);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getDetails() {
        return String.format("Book : [Title: %s, Author: %s, Genre: %s, Year: %d]", this.getTitle(), this.getAuthor(), this.getGenre(), this.getPublicationYear());
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
