package solving.problem.practice;


// print first 10 natural number

public class ProblemThree {
    public static void main(String[] args) {
        int N = 10;
        for( int i=1; i<=N; i++)
            System.out.println(i);

        System.out.println("In reverse order");

        for (int i=N; i>0; i--)
            System.out.println(i);

        System.out.println("Printing first 10 even natural numbers");

        int counter = 1;
        for (int i=2; counter <=N; i=i+2, counter++)
            System.out.println(i);

        System.out.println("Printing first 10 odd natural numbers");
        int oddCounter = 1;
        for(int i=1; oddCounter <= N; i=i+2, oddCounter++)
            System.out.println(i);
    }
}
