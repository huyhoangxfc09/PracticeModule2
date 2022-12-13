package InterfaceResizeable;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    public  double height;
    public  Rectangle(){

    }

    public Rectangle(double width, double height,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", which is a subclass of "
                + super.toString()
                +'}';
    }

    @Override
    public double resize(double percent) {
        this.width = width+(percent/100)*width;
        this.height = height+(percent/100)*height;
        double result = width*height;
        return result;
    }
}
