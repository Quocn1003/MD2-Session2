package ex;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter edge lenght: ");
        float edge = sc.nextFloat();
        float perimeter = edge*4;
        float area = edge*edge;
        System.out.printf("Perimeter = %f\n",perimeter);
        System.out.printf("Area = %f",area);
    }
}
