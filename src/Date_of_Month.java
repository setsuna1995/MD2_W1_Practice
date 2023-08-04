import java.util.Scanner;

public class Date_of_Month {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng cần tra: ");
        month = sc.nextInt();
        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.println("Tháng" + month + " có 31 ngày");
            case 2 -> System.out.println("Tháng " + month + " có 28 hoặc 29 ngày vào năm nhuận");
            case 4,6,9,11 -> System.out.println("Tháng " + month + " có 30 ngày");
        }
    }
}
