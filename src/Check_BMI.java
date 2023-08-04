import java.util.Scanner;

public class Check_BMI {
    public static void main(String[] args) {

        float weight;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng (kg): ");
        weight = sc.nextFloat();
        System.out.println("Nhập vào chiều cao (m): ");
        height = sc.nextFloat();
      float bmi = weight/(height*height);
        System.out.println("Nhập vào cân nặng (kg): ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25 && bmi >= 18.5) {
            System.out.println("Normal");
        }
        else if (bmi < 30 && bmi >= 25.0) {
            System.out.println("Overweight");
        } else if (bmi >= 30.0) {
            System.out.println("Obese");
        }
    }
}
