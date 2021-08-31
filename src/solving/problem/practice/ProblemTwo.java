package solving.problem.practice;
// even or odd


public class ProblemTwo {
    public static void main(String[] args) {

        int num = 20;

        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

//        without % operator

        System.out.println("Without % operator");

        if(num/2*2 == num){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        System.out.println("Another approact");

        if((num & 1) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }

    }
}
