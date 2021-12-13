package solving.problem.practice;
import java.util.ArrayList;
import java.util.Arrays;


public class MoveNegative {
    public static void main(String[] args) {
        int[] elements = {3, -3, 45, 2, -19, -7, 56, 45};
        int[] elements2 = {3, -3, 45, 2, -19, -7, 56, 45};

//        moveAllNegativeNumbers(elements);
        moveAllNegativeNumbers2(elements);


        for(int i: elements)
            System.out.println(i);

    }
//    approach 1 : using existing data structure
    public static void moveAllNegativeNumbers(int[] array){
        ArrayList<Integer> negativeList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int element : array){
            if(element<0)
                negativeList.add(element);
            else
                list.add(element);
        }
        list.addAll(negativeList);
        for(int i=0; i< array.length; i++){
            array[i] = list.get(i);
        }
    }

    //    approach 2 : not using existing data structure
    public static void moveAllNegativeNumbers2(int[] array){
        int[] temp = new int[array.length];
        int j = 0;

        for (int value : array) {
            if (value >= 0) {
                temp[j] = value;
                j++;
            }
        }
        if(j == array.length || j == 0)
            return;

        for (int k : array) {
            if (k < 0) {
                temp[j] = k;
                j++;
            }
        }
        for(int i=0; i<array.length; i++){
            array[i] = temp[i];
        }

    }
}
