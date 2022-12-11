package PointAndMoveablePoint;

import java.util.Scanner;

public class Point {
    private  float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
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
    public float[] getXY(){
        float[]XY = {x,y};
        return XY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        float x = scanner.nextFloat();
        System.out.println("Enter y:");
        float y = scanner.nextFloat();
        Point point = new Point(x,y);
        System.out.println(point);
    }
}
