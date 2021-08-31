package solving.problem.practice;

//Program to print all prime numbers between two numbers

public class ProblemTen {
    public static void main(String[] args) {
        System.out.println("Program to print all prime numbers between two numbers ");

        int lowerLimit = 10;
        int upperLimit = 50;

        while (lowerLimit <= upperLimit){

            if(checkPrime(lowerLimit)){
                System.out.println(lowerLimit);
            }

            lowerLimit++;
        }


    }
    static boolean checkPrime(int num){
        for(int i=2; i <= num/2; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
