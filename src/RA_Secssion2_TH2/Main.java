package RA_Secssion2_TH2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tháng cần kiểm tra");
        int choice = scanner.nextInt();
        switch (choice) {
            case 2:
                System.out.println("Tháng + " + choice + " có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + choice + " có 31 ngày");
                break;

            case 4:
            case 6 :
            case 9 :
                System.out.println("Tháng + " + choice + " có 30 ngày");
                break;
            default:
                System.out.println("Tháng bạn nhập không đúng, mời bạn nhập lại");
                break;
        }
    }
}
