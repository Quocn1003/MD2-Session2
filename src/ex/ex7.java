package ex;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài 3 cạnh của tam giác:");
        double side1, side2, side3;

        do {
            System.out.print("Cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            side3 = scanner.nextDouble();

            if (!isValidTriangle(side1, side2, side3)) {
                System.out.println("Ba cạnh vừa nhập không thể tạo thành tam giác. Vui lòng nhập lại.");
            }
        } while (!isValidTriangle(side1, side2, side3));

        double perimeter = side1 + side2 + side3;
        System.out.println("Chu vi của tam giác là: " + perimeter);

        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Diện tích của tam giác là: " + area);
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Điều kiện để 3 cạnh tạo thành tam giác: tổng độ dài hai cạnh bất kỳ phải lớn hơn cạnh còn lại
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
