package problem.recursion;

// sum of first N natural numbers using recursion

public class SumOfFirstN {
    public static void main(String[] args) {
        int N = 10;

        System.out.println("Sum of first "+N+" numbers : "+ sumOfFirst(N));
    }

    static int sumOfFirst(int n){

        if(n == 1){
            return 1;
        }
        return n+ sumOfFirst(n-1);
    }
}
