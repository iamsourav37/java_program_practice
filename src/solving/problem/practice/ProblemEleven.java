package solving.problem.practice;

//Write a program to reverse the array

public class ProblemEleven {
    public static void main(String[] args) {
        System.out.println("Write a program to reverse the array");

        int[] numbers = {12, 23, 32, 21, 90, 78, 65, 9};
        int length = numbers.length;

        for(int i=0; i<length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[length-1-i];
            numbers[length-1-i] = temp;

        }

        for(int i=0; i<numbers.length; i++){
            System.out.println("numbers["+i+"] = "+ numbers[i]);
        }


    }
}
