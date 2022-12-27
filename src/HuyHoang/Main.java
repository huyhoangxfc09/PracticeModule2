package HuyHoang;

import java.io.*;
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
            FileWriter fileWriter = new FileWriter("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Test.txt",false);
            fileWriter.write("Huy Hoang\n");
            fileWriter.write("23/07/1995\n");
            fileWriter.write("Hung Ha\n");
            fileWriter.write("020920\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
