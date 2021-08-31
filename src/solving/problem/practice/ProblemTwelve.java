package solving.problem.practice;
//Find the minimum and maximum element in an array

public class ProblemTwelve {
    public static void main(String[] args) {
        System.out.println("Find the minimum and maximum element in an array");

        int[] numbers = {12, 23, 32, 34, 45, 54, 56, 7, 10, 11};

        int min, max ;

        min=max = numbers[0];

        for(int i=1; i<numbers.length; i++){
            if(min>numbers[i])
                min = numbers[i];
            if(max<numbers[i])
                max = numbers[i];
        }

        System.out.println("Minimum value is : "+min);
        System.out.println("Maximum value is : "+max);

    }
}
