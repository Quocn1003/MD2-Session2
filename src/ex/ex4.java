package ex;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số bắt đầu của khoảng: ");
        int start = scanner.nextInt();
        System.out.print("Nhập vào số kết thúc của khoảng: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Số bắt đầu phải nhỏ hơn hoặc bằng số kết thúc.");
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.printf("Tổng các số chẵn trong khoảng từ %d đến %d là: %d",start,end,sum);
        }
    }
}
