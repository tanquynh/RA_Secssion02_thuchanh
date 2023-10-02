package RA_Secssion2_TH4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        float height = scanner.nextFloat();
        System.out.println("Nhập cân nặng ");
        float width = scanner.nextFloat();
        float bim;
        String mes;
        bim = width/(height * height);
        System.out.println(bim);
       if(bim <18.5) {
           mes = "Underweight";
       } else if(bim < 25) {
           mes = "Normal";
        } else if(bim <30) {
           mes = "Overweight";
        } else {
           mes = "Obese";
        }

       System.out.println( mes);
    }
}
