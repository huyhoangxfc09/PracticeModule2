package Coordinates;

import java.util.Scanner;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getArray(){
        float[]array = {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        System.out.println("Enter x:");
        float x = scanner.nextFloat();
        System.out.println("Enter y:");
        float y = scanner.nextFloat();
        point2D = new Point2D(x,y);
        System.out.println(point2D);
        for (float element: point2D.getArray()) {
            System.out.println(element);
        }
    }
}
