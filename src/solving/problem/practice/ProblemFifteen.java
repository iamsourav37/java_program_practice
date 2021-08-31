package solving.problem.practice;

//Subarray with given sum

public class ProblemFifteen {
    public static void main(String[] args) {
        System.out.println("Subarray with given sum");

        int[] numbers = {9, 7, 4, 5, 1, 0, 4, 10};
        int lowerLimit = 2;
        int upperLimit = 5;


        int sum = 0;
        for(int i=lowerLimit-1; i<=upperLimit-1; i++){

            sum += numbers[i];
        }

        System.out.println("Sum is : "+sum);


    }
}
