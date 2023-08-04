import java.util.Scanner;

public class USD_to_VND {
    public static void main(String[] args) {
        double usd, vnd, rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dollar number: ");
        usd = sc.nextDouble();
        rate = 23000;
        vnd = usd * rate;
        System.out.println("You can have  " + vnd + " VNĐ");
    }
}
