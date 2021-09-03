package solving.problem.practice;

//Write a Program to Find Largest Number Among ThreeNumbers entered by users

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


           try {
               System.out.println("Enter number 1 : ");
               int number1 = in.nextInt();

               System.out.println("Enter number 2 : ");
               int number2 = in.nextInt();

               System.out.println("Enter number 3 : ");
               int number3 = in.nextInt();

               checkMax(number1, number2, number3);
               checkMinMaxAnotherWay(number1, number2, number3);

           }catch (Exception e){
               System.out.println("Something is wrong.");
           }


    }

    static void checkMax(int number1, int number2, int number3){
        if(number1>number2){
            if(number1>number3){
                System.out.println("Number 1 is greater, "+number1);
            }else{
                System.out.println("Number 3 is greater, "+number3);
            }
        }else{
            if(number2>number3){
                System.out.println("Number 2 is greater, "+number2);
            }else{
                System.out.println("Number 3 is greater, "+number3);
            }
        }
    }

    static void checkMinMaxAnotherWay(int number1, int number2, int number3){
            int[] numbers = {number1, number2, number3};

            int max = numbers[0];
            int min = numbers[0];

            for(int i=1; i<numbers.length; i++){
                if(max<numbers[i])
                    max = numbers[i];
                if(min>numbers[i])
                    min = numbers[i];
            }

        System.out.println("Max : "+ max);
        System.out.println("Min : "+min);

    }
}
