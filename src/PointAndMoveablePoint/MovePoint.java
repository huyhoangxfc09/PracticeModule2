package PointAndMoveablePoint;

import java.util.Scanner;

public class MovePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovePoint(){

    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", which is a subclass of "
                + super.toString()+
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter xSpeed:");
        float xSpeed = scanner.nextFloat();
        System.out.println("Enter ySpeed:");
        float ySpeed = scanner.nextFloat();
        MovePoint movePoint = new MovePoint();
        movePoint = new MovePoint(movePoint.getX(), movePoint.getY(), xSpeed,ySpeed);
        System.out.println(movePoint);
    }
}
