package ch17;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(int i=0; i<library.length; i++) {
            System.out.println(library[i]); // null 만들어감
        }

        for(int i=0; i<library.length; i++) {
            library[i] = new Book("태백산맥"+(i+1), "조정래");
        }

        for(Book book: library) {
            book.info();
        }
        System.out.println("=======================\n얕은 복사");


        // 객체 배열 복사
        // 1. 얕은 복사
        Book[] shallowCopy = new Book[library.length];
        System.arraycopy(library, 0, shallowCopy, 0, library.length);
        for (Book book: shallowCopy) {
            book.info();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        // library와 shallowCopy가 같은 결과가 나옴옴
        System.out.println("=======================");
        for (Book book: library) {
            book.info();
        }

        System.out.println("=======================");
        for (Book book: shallowCopy) {
            book.info();
        }

        System.out.println("=======================\n깊은 복사");

        // 2. 깊은 복사
        Book[] deepCopy = new Book[library.length];
        for (int i=0; i<library.length; i++) {
            deepCopy[i] = new Book(library[i].getTitle(), library[i].getAuthor());
        }

        library[0].setTitle("태백산맥0");
        library[0].setAuthor("조정래");

        // 다른 결과가 나옴
        System.out.println("=======================");
        for (Book book: library) {
            book.info();
        }

        System.out.println("=======================");
        for (Book book: deepCopy) {
            book.info();
        }

    }
}
