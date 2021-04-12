package com.polper.latihan;

public class NonFictionBookBuilder implements Builder {
    private String type;
    private int pages;
    private String author;

    @Override
    public void setBookType(String type) {
        this.type = type;
    }

    @Override
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    public NonFictionBook getResult() {
        return new NonFictionBook(type, pages, author);
    }
}
