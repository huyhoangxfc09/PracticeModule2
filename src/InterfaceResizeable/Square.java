package InterfaceResizeable;

public class Square extends Shape implements Resizeable{
    private double edge;
    public Square(){

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double edge, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge*edge;
    }
    public double getPerimeter(){
        return 4*edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", which is a subclass of "
                + super.toString()
                +'}';
    }

    @Override
    public double resize(double percent) {
        this.edge = edge+(percent/100)*edge;
        double result = edge*edge;
        return result;
    }
}
