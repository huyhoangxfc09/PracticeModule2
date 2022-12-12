package Comparable;

public  class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "color='" + super.getColor() + '\'' +
                '}';
    }
}
