package Demo;

import java.util.Scanner;

public class TotalDiagonalsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line number:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        int colum = scanner.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Element: [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The generated two-dimensional array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        if (colum == row) {
            for (int i = (row-1); i>=0; i--) {
                        sum += array[i][row-1-i];
                }
            System.out.println("Total diagonals: " + sum);
        }else {
            System.out.println("Not a square matrix.");
        }
    }
}
