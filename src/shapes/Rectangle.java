package shapes;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public int computeArea() {
        return width*height;
    }

    public void setWidth(int width) {
        this.width = 100;
    }

    public void setHeight(int height) {
        this.height = 100;
    }
}
