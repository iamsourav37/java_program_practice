package solving.problem.practice;

//Write a Program to display sum of all digits of a givenNumber N by user

public class Problem21 {
    public static void main(String[] args) {
        int N = 5232;

        System.out.println("Sum of all digits of "+N+" is : "+ sumOfAllDigits(N));

    }
    static int sumOfAllDigits(int n){
        int sum = 0;

        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
