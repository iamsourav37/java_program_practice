package solving.problem.practice;
//Program to calculate sum of first N natural numbers

public class ProblemSeven {
    public static void main(String[] args) {
        System.out.println("Program to calculate sum of first N natural numbers");

        int N = 10;

        int sum = 0;

        for (int i=1; i <= N; i++){
            sum += i;
        }

        System.out.println("Sum of first "+N+" numbers : "+sum);
    }
}
