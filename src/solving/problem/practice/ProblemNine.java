package solving.problem.practice;
//Program to check whether a number is Prime or not


public class ProblemNine {

    public static void main(String[] args) {
        System.out.println("Program to check whether a number is Prime or not");

        int num = 23;
        boolean flag = true;

        for(int i=2; i<= num/2; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
    }
}
