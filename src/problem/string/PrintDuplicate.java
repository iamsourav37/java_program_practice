package problem.string;

import java.util.ArrayList;

public class PrintDuplicate {
    public static void main(String[] args) {
        String str = "I love programming, and java";

        ArrayList<Character> chList = new ArrayList<>(str.length());
        char[] chArray = str.toCharArray();

        for(int i=0; i<chArray.length; i++){
            if(!chList.contains(chArray[i])){
                for(int j=i+1; j<chArray.length; j++){
                    if(chArray[i]==chArray[j]){
                        chList.add(chArray[i]);
                        break;
                    }
                }
            }
        }

        System.out.println(chList);
    }
}
