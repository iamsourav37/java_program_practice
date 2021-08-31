package solving.problem.practice;
//Program to calculate sum of digits of a number

public class ProblemFive {
    public static void main(String[] args) {
        int num = 3498901;

        int sum = 0;
        int rem;

        while (num > 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println("Sum of digits : "+sum);
    }
}
