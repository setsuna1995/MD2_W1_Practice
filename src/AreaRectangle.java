import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = sc.nextDouble();
        System.out.println("Nhập chiều dài: ");
        height = sc.nextDouble();
        double area = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
