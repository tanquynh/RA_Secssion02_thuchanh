package RA_Secssion2_TH1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = scanner.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = scanner.nextDouble();
        if(a != 0) {
            System.out.println("Phương trình có nghiệm là : " + (c -b)/a);
        } else {
            if(b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
