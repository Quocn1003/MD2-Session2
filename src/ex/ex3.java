package ex;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100 là:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
