package ch18;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        for(int i=0; i<5; i++) {
            books.add(new Book("태백산맥"+(i+1), "조정래"));
        }

        for (Book book: books) {
            book.info();
        }
        System.out.println("\n==============================\n");

        for(int i=0; i<5; i++) {
            books.get(i).info();
        }

    }
}
