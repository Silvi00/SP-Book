import java.util.ArrayList;

public class Section implements Element{

    protected String title;
    protected ArrayList<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);

        for(Element e : this.elements){
            e.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int i) {
        return elements.get(i);
    }
}
