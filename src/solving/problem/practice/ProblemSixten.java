package solving.problem.practice;

//Move all negative elements to end

import java.util.ArrayList;

public class ProblemSixten {

    public static void main(String[] args) {
        System.out.println("Move all negative elements to end");
        int[] numbers = {1, -1, 3, 2, -7, -5, 11, 6 };

        ArrayList<Integer> negativeList = new ArrayList<>();
        ArrayList<Integer> positiveList = new ArrayList<>();

        for(int value : numbers){
            if(value<0){
                negativeList.add(value);
            }else{
                positiveList.add(value);
            }
        }

        positiveList.addAll(negativeList);

        for(int i=0; i<numbers.length; i++){
            numbers[i] = positiveList.get(i);
        }


        for(int value : numbers)
            System.out.println(value);



    }
}

   