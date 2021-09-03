package problem.recursion;

// get power using recursion

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int expo = 4;

        System.out.println("Result : "+ getPower(base, expo));
    }

    static int getPower(int base, int expo){
       if( expo == 0 || expo == 1){
           return base;
       }
       else{
           return base* getPower(base, expo-1);
       }

    }
}
