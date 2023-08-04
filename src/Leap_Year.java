import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần tra: ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Năm " + year + " không phải là năm nhuận");
        } else if (year % 400 == 0 && year % 100 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        }
        else {
            System.out.println("Năm " + year + " không phải là năm nhuận");
        }
    }
}
