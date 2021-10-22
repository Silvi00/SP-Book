import java.util.ArrayList;
import java.util.Collection;

public class SubChapter implements Element{
    private String name;
    private ArrayList<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);

        for(Element element : elements){
            element.print();

        }

    }

    public void createNewParagraph(String text) {
        Paragraph p = new Paragraph(text);
        elements.add(p);
    }

    public void createNewImage(String imageName) {
        Image i = new Image(imageName);
        elements.add(i);
    }

    public void createNewTable(String title) {
        Table t = new Table(title);
        elements.add(t);
    }
}
