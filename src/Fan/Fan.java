package Fan;

import java.util.Scanner;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    private final int FAST = 3;
    private  int speed =SLOW;
    private boolean on = false;
    private double radius= 5;
    private String color = "blue";
    public Fan(){
    }
    public Fan(int speed,boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public  void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        String result = "";
        if (this.isOn()) {
            result += ("Fan is on\n");
            result += ("Speed: " + this.speed +"\n");
        } else {
            result += ("Fan is off\n");
        }
        result += ("Color: " + this.color + "\n");
        result += ("Radius: " + this.radius + "\n");
        return result;
    }


    public static void main(String[] args) {
       Fan fan = new Fan();
       System.out.println(fan.toString());
       fan.setOn(true);
       fan.setSpeed(fan.FAST);
       fan.setRadius(10);
       fan.setColor("Yellow");
       System.out.println(fan.toString());
    }
}


