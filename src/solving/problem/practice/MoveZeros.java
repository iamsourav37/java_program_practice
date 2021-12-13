package solving.problem.practice;

public class MoveZeros {
    public static void main(String[] args) {
        int[] elements = {10, 2, 78, 0, 0, 30, 19, 16, 17, 80, 13, 20, 0, 6, -7};

        moveAllZerosToEnd(elements);

        for(int value : elements)
            System.out.println(value);
    }

    public static void moveAllZerosToEnd(int[] array){
        int[] temp = new int[array.length];

        int j=0;
        for(int i : array){
            if(i != 0){
                temp[j] = i;
                j++;
            }
        }

        for(int i=0; i<array.length; i++)
            array[i] = temp[i];
    }
}
