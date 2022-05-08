package ch02;

public class TextBlockTest {
    public static void main(String[] args) {
        String textBlock = """
                            thid
                            is
                            text
                            block
                            test.""";
        System.out.println(textBlock);
        System.out.println(getBlockOfHtml());

    }

    public static String getBlockOfHtml() {
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
    }
}
