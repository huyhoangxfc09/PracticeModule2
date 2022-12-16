package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer>array = new Stack<>();
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1));
            int element = scanner.nextInt();
            array.push(element);
        }
        System.out.println("Initial array:");
        for (Integer e : array) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("The following array is reversed:");
        for (int i = 0; i < n; i++) {
            System.out.print(array.pop()+" ");
        }
    }
}
