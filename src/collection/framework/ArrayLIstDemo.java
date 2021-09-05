package collection.framework;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayLIstDemo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");


        ArrayList<String> frameworks = new ArrayList<>();

        frameworks.add("Spring");
        frameworks.add("Django");
        frameworks.add("React");

        languages.addAll(frameworks);

        System.out.println(languages);
        System.out.println(frameworks);

        ArrayList<String> technologies = new ArrayList<>();

        technologies.add("IOT");
        technologies.add("AI");

        technologies.addAll(1, languages);
        System.out.println(technologies);

        ArrayList<String> cloneList = (ArrayList<String>) technologies.clone();

        System.out.println(cloneList.lastIndexOf("Java"));

        cloneList.retainAll(Arrays.asList("Java", "Javascript", "Ruby"));

        System.out.println(cloneList);

        System.out.println(cloneList.remove("Javascript"));
        System.out.println(cloneList);


        ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(12, 23, 34, 45, 54, 43, 33, 79));

        oddList.removeIf((ele -> ele%2 == 0));


        System.out.println(oddList);



    }
}
