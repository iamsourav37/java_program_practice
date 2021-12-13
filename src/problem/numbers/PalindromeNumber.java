package problem.numbers;

public class PalindromeNumber {
    public static void main(String...args){
        int num1 = 121;
        int num2 = 456;

        System.out.println("Check palindrome for "+num1+" : "+ isPalindromeNumber(num1));
        System.out.println("Check palindrome for "+num2+" : "+ isPalindromeNumber(num2));


    }
    public static boolean isPalindromeNumber(int num){

        int rev = 0;
        int temp = num;

        while(temp>0){
            int rem = temp % 10;
            rev = (rev*10) + rem;
            temp /= 10;
        }

        return rev == num;
    }
}
