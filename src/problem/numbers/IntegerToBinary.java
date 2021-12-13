package problem.numbers;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary : "+ binaryString);
    }
}
