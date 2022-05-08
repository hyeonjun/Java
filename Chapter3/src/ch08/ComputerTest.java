package ch08;


public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        NoteBook noteBook = new MyNoteBook();
        noteBook.typing();
        noteBook.display();

    }

}
