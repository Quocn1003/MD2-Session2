package ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số tự nhiên: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("Số %d chia hết cho cả 3 và 5.",number);
        } else {
            System.out.printf("Số %d không chia hết cho cả 3 và 5.",number);
        }
    }
}
