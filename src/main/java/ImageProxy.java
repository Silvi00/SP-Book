import java.awt.*;

public class ImageProxy implements Element{

    String url;
    Dimension dim;
    Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    void loadImage() {
        if(realImage == null){
            realImage = new Image(url);
        }
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();

    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
