package test;

public class StaticDemo {
    public static void main(String[] args) {

        try{
            Person p = new Person();


            System.out.println(Person.getName());
            System.out.println(p.getAge());


            System.out.println(10/0);



        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("All resources are closed.");
        }

        System.out.println(10/0);

        System.out.println("hello ");

    }
}


class Person{
    final private static String name;
    private int age;
    private double salary;
    static {
        name = "Sourav";
    }

    static String getName(){
       return Person.name;
    }
    public int getAge(){
        return this.age;
    }
    public Person(){

    }
}
