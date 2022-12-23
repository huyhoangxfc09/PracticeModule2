package HuyHoang;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        File file = new File("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Test.txt",true);
            int input = Integer.parseInt(scanner.nextLine());
            fileWriter.write(input+"\n");
            fileWriter.write(input+"\n");
            fileWriter.write(input+"\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
