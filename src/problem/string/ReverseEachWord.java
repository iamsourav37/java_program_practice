package problem.string;

// reverse each word in a given string

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Soft Skills is Important";

        String reverse = reverseEachWord(str);
        System.out.println("Reverse Each Word : "+ reverse);

        System.out.println("Reverse Each Word : "+ reverseEachWord("Hello World"));
    }
    public static String reverseEachWord(String s){
        s = s.trim();
        String reverse = "";
        String[] sArray = s.split(" ");

        for(String word : sArray){
            String rWord = reverseString(word);
            rWord += " ";
            reverse = reverse.concat(rWord);
        }

        return reverse.trim();
    }

    public static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--)
            rev += String.valueOf(s.charAt(i));
        return rev;
    }
}
