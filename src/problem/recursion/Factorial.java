package problem.recursion;
// factorial using recursion

public class Factorial {
    public static void main(String[] args) {

        int N = 5;

        System.out.println("Factorial of "+N+" is : "+ getFactorial(N));
    }

    static int getFactorial(int n){
        if(n<0){
            return -1;
        }

        return Factorial.calculateFactorial(n);
    }

    static int calculateFactorial(int n){
        if( n==0 || n == 1)
            return 1;
        else
            return n* getFactorial(n-1);
    }
}
