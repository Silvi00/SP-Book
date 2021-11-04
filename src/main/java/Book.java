import java.util.ArrayList;

public class Book extends Section implements Element{

    private ArrayList<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.title);

        System.out.println("Authors: ");
        for(Author a : authors)
            a.print();

        for(Element e : this.elements)
            e.print();
    }
}
