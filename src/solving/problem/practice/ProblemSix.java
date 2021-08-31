package solving.problem.practice;
//Program to reverse a number
public class ProblemSix {
    public static void main(String[] args) {

        System.out.println("Program to reverse a number");

        int num = 98723459;
        int temp = num;
        int reverseNumber = 0;
        int rem;

        while (temp > 0){
            rem = temp % 10;
            reverseNumber = (reverseNumber*10) + rem;
            temp /= 10;
        }

        System.out.println("Original number : "+ num);
        System.out.println("Reversed number : "+ reverseNumber);
    }

}
