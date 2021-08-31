package solving.problem.practice;

// Find the occurrence of an integer in the array

import java.util.Arrays;

public class ProblemFourteen {
    public static void main(String[] args) {
        System.out.println("Find the occurrence of an integer in the array");

        int[] arr = {12, 23, 32, 12, 34, 45, 12, 23, 32};

        int key = 12;
        int count = 0;

        for (int j : arr) {
            if (key == j) {
                count++;
            }
        }

        System.out.println("Occurance of "+key+" is : "+count);


        int[] a = {0, 2, 1, 2, 0};

        Arrays.sort(a);

        for(int j : a)
            System.out.println(j);

    }
}
