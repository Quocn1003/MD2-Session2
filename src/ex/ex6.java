package ex;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd(scanner);
                    break;
                case 2:
                    checkPrime(scanner);
                    break;
                case 3:
                    checkDivBy3(scanner);
                    break;
                case 4:
                    System.out.println("Bạn đã chọn thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
            }
            System.out.println();
        } while (choice != 4);
    }

    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    public static void checkPrime(Scanner scanner) {
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không là số nguyên tố.");
        }
    }

    public static void checkDivBy3(Scanner scanner) {
        System.out.print("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
