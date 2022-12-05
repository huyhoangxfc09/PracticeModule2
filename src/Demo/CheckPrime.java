package Demo;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test value");
        int value = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <=value; i++) {
            if (checkPrime(i)){
                count++;
                System.out.println("Element "+count+ " => "+i);
            }
        }
    }
    public static boolean checkPrime(int number){
        if (number<2){
            return false;
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }return true;
    }
}
