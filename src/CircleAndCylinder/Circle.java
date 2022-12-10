package CircleAndCylinder;

import java.util.Scanner;

public class Circle {
    private double radius =1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of  the circle:");
        String color = scanner.nextLine();
        circle.setRadius(radius);
        circle.setColor(color);
        System.out.println("Radius = "+circle.getRadius()+"\n"+"Color = "+circle.getColor());
        System.out.println(circle);
    }
}
