package solving.problem.practice;
//Program to count digits in a number


public class ProblemFour {
    public static void main(String[] args) {
        System.out.println("Program to count digits in a number ");
        int num = 250_000_000;

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }

        System.out.println("Digits : "+ count);




    }
}
