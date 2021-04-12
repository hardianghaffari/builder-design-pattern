package com.polper.latihan;

public class FictionBookBuilder implements Builder {
    private String type;
    private int pages;
    private String author;

    @Override
    public void setBookType(String type){
        this.type = type;
    }

    @Override
    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public void setAuthor(String author){
        this.author = author;
    }

    public FictionBook getResult(){
        return new FictionBook(type, pages, author);
    }
}
