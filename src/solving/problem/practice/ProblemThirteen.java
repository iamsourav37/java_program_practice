package solving.problem.practice;
//Kth smallest element
/*
* Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
* */

import java.util.Arrays;

public class ProblemThirteen {
    public static void main(String[] args) {
        int[] numbers = {7, 10, 4, 3, 20, 15};
        int k = 3; // You can read this variable from user also

        Arrays.sort(numbers);

        System.out.println(numbers[k-1]);
    }
}
