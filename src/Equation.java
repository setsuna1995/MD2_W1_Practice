import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a;
        double b;
        double x;
        System.out.println("Nhập các thông số của phương trình có dạng ax +by = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        System.out.println("Nhập b: ");
        b = sc.nextDouble();
        if (a != 0) {
            x = b/a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
        else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
