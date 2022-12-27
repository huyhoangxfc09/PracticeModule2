package Bai17;



import java.io.*;

public class Test {
    public static void main(String[] args)  throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };

        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        os.close();
    }
}
