import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<SubChapter>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Chapter: " + this.name);

        for (SubChapter s : this.subChapters) {
            s.print();
        }
    }

    public int createSubChapter(String name) {
        SubChapter s = new SubChapter(name);
        subChapters.add(s);
        return subChapters.indexOf(s);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }
}
