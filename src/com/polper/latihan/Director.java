package com.polper.latihan;

public class Director {
    public void constructFictionLocal(Builder builder){
        builder.setBookType("Fiction");
        builder.setPages(180);
        builder.setAuthor("Pramoedya Ananta Toer");
    }

    public void constructFictionInternational(Builder builder){
        builder.setBookType("Fiction");
        builder.setPages(378);
        builder.setAuthor("J. K. Rowling");
    }

    public void constructNonFictionLocal(Builder builder){
        builder.setBookType("Non-Fiction");
        builder.setPages(389);
        builder.setAuthor("Soe Hok Gie");
    }

    public void constructNonFictionInternational(Builder builder){
        builder.setBookType("Non-Fiction");
        builder.setPages(508);
        builder.setAuthor("Jean le Rond d'Alembert");
    }
}
