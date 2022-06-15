package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book littleBook = new Book("Bedtime story", 5);
        Book novel = new Book("War and Piece", 300);
        Book textbook = new Book("English textbook", 50);
        Book cleanCode = new Book("Clean code", 30);
        Book[] booksArray = new Book[4];
        booksArray[0] = littleBook;
        booksArray[1] = novel;
        booksArray[2] = textbook;
        booksArray[3] = cleanCode;
        for (int index = 0; index < booksArray.length; index++) {
            Book bk = booksArray[index];
            System.out.println("Book " + bk.getName() + " - " + bk.getPageNumber() + " pages.");
        }
        System.out.println("We change arrays elements 0 and 3. Books array after change:");
        Book change = booksArray[0];
        booksArray[0] = booksArray[3];
        booksArray[3] = change;
        for (Book bk1 : booksArray) {
            System.out.println("Book " + bk1.getName() + " - " + bk1.getPageNumber() + " pages.");
        }
        System.out.println("Search of book \"Clean code\":");
        for (int i = 0; i < booksArray.length; i++) {
            if ("Clean code".equals(booksArray[i].getName())) {
                System.out.println("You searched the book \"" + booksArray[i].getName() + "\"");
            }
        }
    }
}
