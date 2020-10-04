package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book kafka = new Book("Process", 100);
        Book bradberry = new Book("451", 200);
        Book programming = new Book("Clean code", 300);
        Book tolstoy = new Book("War and peace", 400);

        Book[] books = new Book[4];
        books[0] = kafka;
        books[1] = bradberry;
        books[2] = programming;
        books[3] = tolstoy;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPageCount());
        }

        System.out.println("----------------");
        System.out.println("invert 0 and 3rd");
        System.out.println("----------------");

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPageCount());
        }

        System.out.println();
        System.out.println("only Clean code: ");
        System.out.println();

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " - " + b.getPageCount());
            }
        }
    }
}
