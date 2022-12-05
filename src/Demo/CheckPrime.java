package Demo;

public class CheckPrime {
    public static void main(String[] args) {
        int count = 0;
        int number =0;
        while (count<20){
            if(checkPrime(number)){
                count++;
                System.out.println("Element "+count+" => "+number);
            }
            number++;
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
