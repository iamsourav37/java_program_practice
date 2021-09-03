package solving.problem.practice;
//Program to print all Armstrong numbers under 1000


public class ProblemEight {
    public static void main(String[] args) {
        System.out.println("Program to print all Armstrong numbers under 1000");

        for (int i=1; i<=1000; i++){
            if(checkArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    {
        System.out.println("first");
    }
    static{
        System.out.println("static");
    }

    static boolean checkArmstrong(int num){
        int sum = 0;
        int temp = num;
        int rem;

        while (temp > 0){

            rem = temp % 10;
            sum += rem*rem*rem;
            temp /= 10;
        }

        return num == sum;
    }
}
