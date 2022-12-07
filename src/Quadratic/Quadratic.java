package Quadratic;

import java.util.Scanner;

public class Quadratic {
    int numberA, numberB, numberC;

    public Quadratic() {
    }

    public Quadratic(int numberA, int numberB, int numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public int getNumberA() {
        return this.numberA;
    }

    public int getNumberB() {
        return this.numberB;
    }

    public int getNumberC() {
        return this.numberC;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public void setNumberC(int numberC) {
        this.numberC = numberC;
    }

    public int getDiscriminant() {
        return (this.numberB * this.numberB - 4 * this.numberA * this.numberC);
    }

    public double getRoot1() {
        return (-this.numberB + Math.sqrt(this.numberB * this.numberB - 4 * this.numberA * this.numberC)) / (2 * this.numberA);
    }

    public double getRoot2() {
        return (-this.numberB - Math.sqrt(this.numberB * this.numberB - 4 * this.numberA * this.numberC)) / (2 * this.numberA);
    }

    public double getRoot() {
        return (-this.numberB) / (2 * this.numberA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numberA:");
        int numberA = scanner.nextInt();
        System.out.println("Input numberB:");
        int numberB = scanner.nextInt();
        System.out.println("Input numberC:");
        int numberC = scanner.nextInt();
        Quadratic quadratic = new Quadratic(numberA, numberB, numberC);
        System.out.println("NumberA = " + quadratic.getNumberA());
        System.out.println("NumberB = " + quadratic.getNumberB());
        System.out.println("NumberC = " + quadratic.getNumberC());
        System.out.println("Delta = " + quadratic.getDiscriminant());
        if (quadratic.getDiscriminant() < 0) {
            System.out.println("The equation has no solution.");
        } else if (quadratic.getDiscriminant() == 0) {
            System.out.println("Root1 = Root2 =" + quadratic.getRoot());
        } else {
            System.out.println("Root1 = " + quadratic.getRoot1() + "\n");
            System.out.println("Root2 = " + quadratic.getRoot2());
        }
    }
}
