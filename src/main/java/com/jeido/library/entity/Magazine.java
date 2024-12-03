package com.jeido.library.entity;

public final class Magazine extends LibraryItem {
    private final int issueNumber;

    public Magazine(String title, int publicationYear, int issueNumber) {
        super(title, publicationYear);

        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails() {
        return String.format("Magazine: [Title: %s, N: %d, Year: %d]", this.getTitle(), this.getIssueNumber(), this.getPublicationYear());
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
