package solving.problem.practice;

//Write a Program to Reverse a given Number N by user


import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int N = sc.nextInt();

        System.out.println("Reverse is : "+ reverse(N) );



    }

    static int reverse(int number){
        int rev = 0;

        while(number>0){
            rev = (rev*10) + (number%10);
            number /= 10;
        }
        return rev;
    }
}
