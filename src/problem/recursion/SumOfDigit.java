package problem.recursion;

public class SumOfDigit {

    public static void main(String[] args) {

        int n = 5487;
        System.out.println("Sum of digit : "+ sum(n));

    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
