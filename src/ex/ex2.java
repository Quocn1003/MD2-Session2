package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int USDtoVND = 24000;
        System.out.print("Enter amount USD: ");
        int USD = sc.nextInt();
        System.out.println("------USD to VND------");
        int VND = USD * USDtoVND;
        System.out.printf("%d USD = %d VND",USD,VND);
    }
}
