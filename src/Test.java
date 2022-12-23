import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\D\\Java\\PracticeModule2\\src\\Huy");
        System.out.println("File exits??? " + file.exists());
        File dir = new File("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang");
        dir.mkdirs();
        File dir1 = new File("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Demo.txt");
        try {
            dir1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter("C:\\D\\Java\\PracticeModule2\\src\\HuyHoang\\Demo.txt",false);
            fileWriter.write("Tran Huy Hoang\n");
            fileWriter.write("23/07/1995\n");
            fileWriter.write("Hung Ha\n");
            fileWriter.write("020920\n");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(dir1);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dir1.getAbsolutePath());
    }
}
