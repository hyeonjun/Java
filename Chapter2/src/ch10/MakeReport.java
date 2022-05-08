package ch10;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private final String line = "===========================================\n";

    private void makeHeader() {
        buffer.append(line);
        String title = " 이름\t   주소 \t\t\t  전화번호  \n";
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US  \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }



}
