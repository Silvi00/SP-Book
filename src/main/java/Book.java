import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Author> authors;
    private ArrayList<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<Chapter>();
        this.authors = new ArrayList<Author>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void print(){
        System.out.println("Book: " + this.title);

        for(Chapter c : this.chapters){
            c.print();
        }
    }

    public int createChapter(String name) {
        Chapter c = new Chapter(name);
        chapters.add(c);
        return chapters.indexOf(c);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }


}
