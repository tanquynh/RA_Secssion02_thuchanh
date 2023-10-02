package RA_Secssion2_TH3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        if(year % 4 == 0) {
            if(year % 100 != 0) {
                System.out.println(year + " là năm nhuận");
            } else {
                if(year % 400 != 0) {
                    System.out.println(year + " không phải là năm nhuận");
                }
                else  {
                    System.out.println(year + " là năm nhuận");
                }
            }
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
