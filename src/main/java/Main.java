public class Main {

    public static void Printing() {
        DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) {
        Book myBook = new Book("My Book");
        DocumentManager.getInstance().setBook(myBook);
        Author me = new Author("My Self");
        myBook.addAuthor(me);
        Section cap1 = new Section("Capitolul 1");
        myBook.add(cap1);
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");

        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);


        Printing();
    }
}
