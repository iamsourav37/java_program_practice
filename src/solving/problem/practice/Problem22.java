package solving.problem.practice;

//Write a Program to Display all Factors of a number

public class Problem22 {
    public static void main(String[] args) {

        int N = 24;

        System.out.println("All factors of "+N+" is : ");
        for(int i=1; i<=N/2; i++){
            if(N % i == 0)
                System.out.println(i);
        }
        System.out.println(N);

    }
}
