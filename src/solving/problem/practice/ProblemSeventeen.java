package solving.problem.practice;

//Write a Program to Check Whether a Character isVowel or Consonant

import java.util.Scanner;

public class ProblemSeventeen {

    public static void main(String[] args) {
        System.out.println("Program to Check Whether a Character isVowel or Consonant");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch<= 'Z') || (ch>='a' && ch<='z')){

            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println("Its a vowel");
            }else{
                System.out.println("Its a consonant");
            }


        }else{
            if(ch>='0' && ch<='9')
                System.out.println("Its a digit");
            else
                System.out.println("Its a special character");
        }
    }
}
