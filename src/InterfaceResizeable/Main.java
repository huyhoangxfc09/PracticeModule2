package InterfaceResizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(8,6);
        Square square = new Square(5);
        Double[]arrShape = new Double[3];
        arrShape[0]=circle.getArea();
        arrShape[1]= rectangle.getArea();
        arrShape[2]= square.getArea();
        System.out.println("Area of original shapes:");
        for (Double element : arrShape) {
            System.out.println(element);
        }
        double percent = Math.floor(Math.random()*100);
        System.out.println("Percent: "+percent+"%");
        arrShape[0]=circle.resize(percent);
        arrShape[1]=rectangle.resize(percent);
        arrShape[2]=square.resize(percent);
        System.out.println("Area of shapes after resizing:");
        for (Double element : arrShape) {
            System.out.println(element);
        }
    }
}
