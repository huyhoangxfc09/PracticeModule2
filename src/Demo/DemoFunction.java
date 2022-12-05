package Demo;

import java.util.Scanner;

public class DemoFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input element "+(i+1)+" : ");
            array[i]= scanner.nextInt();
        }
        System.out.println("Creat new array:");
        for (int element : array) {
            System.out.println(element+" ");
        }
        System.out.println("Minimum value in array: "+minArray(array));
    }
    public static int minArray(int[]array){
        int min = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
