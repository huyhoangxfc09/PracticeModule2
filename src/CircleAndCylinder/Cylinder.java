package CircleAndCylinder;

import java.util.Scanner;

public class Cylinder extends Circle{

    private double height = 5.0;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCylindricalVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                + ", which is a subclass of "
                + super.toString()
                +'}';
    }

    public static void main(String[] args) {
        Cylinder cylinder =new Cylinder();
        System.out.println(cylinder);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of the Cylinder:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the base radius of the cylinder:");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color of the cylinder:");
        String color = scanner.nextLine();
        cylinder =new Cylinder(radius,color,height);
        System.out.println(cylinder);
        System.out.println(cylinder.getCylindricalVolume());
    }
}
