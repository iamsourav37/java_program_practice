package problem.string;

// write a java program to count the total number of occurances of a given character in a string
// without using any loop

public class CountOccurance {
    public static void main(String[] args) {
        String str = "Java Program";
        char ch = 'a';
        System.out.println(ch+" occurance is : "+countOccurance(str, ch));

    }
    public static int countOccurance(String s, char ch){
//        int fullLength = s.length();
//        s = s.replace(String.valueOf(ch), "");
//        int newLength = s.length();
//        return fullLength - newLength;

//      one liner
        return s.length() - s.replace(String.valueOf(ch), "").length();
    }
    public static int countOccuranceUsingLoop(String s, char ch){
        // using loop
        int count = 0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i) == ch)
                count++;

        return count;
    }
}
