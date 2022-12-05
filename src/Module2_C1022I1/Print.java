package Module2_C1022I1;

public class Print {
    public static void main(String[] args) {
        //print(): hàm có sẵn của đầu ra, in kết quả trên 1 dòng
        System.out.print("a");
        System.out.print("b");
        System.out.println();
//        => "ab"
        //println(): hàm có sẵn của đầu ra, in kết quả trên 1 dòng + \n (1 lần enter)
        System.out.println("a");
        System.out.println("b");
//        => "a" + enter + "b"
//        => "a"
//           "b"
        //printf(): hàm có sẵn của đầu ra, in kết quả theo 1 định dạng cho trước
        // \n: tương đương với enter
        System.out.printf("%s%20s", "Tên", "Giá\n");
        System.out.printf("%s%20s", "Hello", "World\n");
        System.out.printf("%s%20s", "A", "B\n");
        System.out.printf("%s%20s", "C", "D\n");
    }
}
