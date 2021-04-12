package com.polper.latihan;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        FictionBookBuilder fictionBookBuilder = new FictionBookBuilder();

        director.constructFictionLocal(fictionBookBuilder);
        FictionBook fb1 = fictionBookBuilder.getResult();
        System.out.println("Informasi Buku :\n" + fb1.showProduct());

        director.constructFictionInternational(fictionBookBuilder);
        FictionBook fb2 = fictionBookBuilder.getResult();
        System.out.println("Informasi Buku :\n" + fb2.showProduct());

        NonFictionBookBuilder nonFictionBookBuilder = new NonFictionBookBuilder();

        director.constructNonFictionLocal(nonFictionBookBuilder);
        NonFictionBook nfb1 = nonFictionBookBuilder.getResult();
        System.out.println("Informasi Buku :\n" + nfb1.showProduct());

        director.constructNonFictionInternational(nonFictionBookBuilder);
        NonFictionBook nfb2 = nonFictionBookBuilder.getResult();
        System.out.println("Informasi Buku :\n" + nfb2.showProduct());


    }
}
