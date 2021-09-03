package solving.problem.practice;
//Write a Program to Check whether a year entered byuser is Leap Year or not


import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year : ");
        int year = sc.nextInt();

        System.out.println(year+" is Leap Year. ---> "+ checkLeapYear(year));


    }

    static boolean checkLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
