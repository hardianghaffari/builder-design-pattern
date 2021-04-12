package com.polper.latihan;

public class NonFictionBook {
    private String type;
    private int pages;
    private String author;

    public NonFictionBook(String type, int pages, String author){
        this.type = type;
        this.pages = pages;
        this.author = author;
    }
    public String getBookType() {
        return this.type;
    }

    public int getPages(){
        return this.pages;
    }

    public String getAuthor(){
        return this.author;
    }

    public String showProduct(){
        return "Fiction Book: \n"
        + "Book Type : " + getBookType() + "\n"
        + "Pages : " + getPages() + "\n"
        + "Author : " + getAuthor() + "\n";
    }
}
