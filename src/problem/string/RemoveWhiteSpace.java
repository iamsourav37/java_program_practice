package problem.string;

// remove whitespaces from a string

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Java Program";

        System.out.println("After removing white spaces string is : "+ removeWhitespaces(str));
    }

    public static String removeWhitespaces(String s){
        return s.replace(" ", "");
    }
}
