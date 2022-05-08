package ch10;


import java.util.ArrayList;

class FastLibrary {
    public ArrayList<String> shelf = new ArrayList<>();

    public FastLibrary() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        while (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }
        /*if (shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }*/
        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + ": " + book + " lend");
            return book;
        }
        return null;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll(); // notify();
        System.out.println(t.getName() + ": " + book + " return");
    }
}

class Student extends Thread{

    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) {
                System.out.println(getName() + "책을 빌리지 못했음");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        for (int i=1; i<11; i++) {
            st.add(new Student("std"+i));
        }

        for (int i=0; i<10; i++) {
            st.get(i).start();
        }



    }

}
