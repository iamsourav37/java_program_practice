package problem.string;

// write a java program to count the number of words in a string

public class CountWords {
    public static void main(String[] args) {
        String str = "I want to become a good software engineer";
        String str2 = "Hello World";
        String str3 = "I love Java";

        System.out.println("Word Count : "+ countWords(str));
        System.out.println("Word Count : "+ countWords2(str));
    }
    public static int countWords(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++)
            if(String.valueOf(s.charAt(i)).equals(" ")){
                count++;
            }

        count++;
        return count;
    }

    public static int countWords2(String s){
        String[] sArray =  s.split(" ");
        return sArray.length;
    }
}
