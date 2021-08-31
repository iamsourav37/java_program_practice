package solving.problem.practice;
// swaping programs


public class ProblemOne {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;

       // swaping

        int c = a;
        a = b;
        b = c;

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);


        // without third variable

        System.out.println("Without third variable");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);

    }


}
