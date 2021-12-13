package problem.string;


// write a java program to reverse a string

public class ReverseString {
    public static void main(String[] args) {

        String str = "Soft skills is important";

        System.out.println("Reverse : "+ reverseString(str));


    }
    public static String reverseString(String s){
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
            reverse.append(s.charAt(i));
        return reverse.toString();
    }

}
