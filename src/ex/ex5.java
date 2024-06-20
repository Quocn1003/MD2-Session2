package ex;

public class ex5 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");

        int count = 0;
        int number = 2;

        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
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
