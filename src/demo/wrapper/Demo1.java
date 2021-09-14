package demo.wrapper;

public class Demo1 {
    public static void main(String[] args) {


//        Integer obj1 = Integer.valueOf("23");
//        System.out.println(obj1);
//
//
//        System.out.println(obj1.intValue()+1);

        Integer[] intArray = new Integer[4];


        intArray[0] = 12;
        intArray[3] = 90;


        for(Integer i: intArray){
            System.out.println(i);
        }
    }
}
