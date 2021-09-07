package test;

public class AnonymousClassDemo {
    public static void main(String[] args) {

        Abc abc = new Abc() {
            @Override
            void display() {
                System.out.println("display method in Abc class is invoked");
            }

            // no annotation, but still it is overriding the method
            public String getMessage(){
                return "this is the example of anonymous class";
            }
        };

        abc.display();
        System.out.println(abc.getMessage());

//      anonymous interface example
        I1 i = new I1() {
            @Override
            public int getAge() {
                return 23;
            }

            @Override
            public String getName() {
                return "Sourav Ganguly";
            }
        };

        System.out.println(i.getAge());
        System.out.println(i.getName());
        i.showDetails();
        I1.sayHello("Raja");
    }
}


abstract class Abc{
    abstract void display();
    public abstract String getMessage();
}

interface I1{
    int getAge();
    String getName();

    default void showDetails(){
        System.out.println("hello welcome");
        System.out.println("this is Sourav");
    }
    static void sayHello(String name){
        System.out.println("hello "+name+", how are you?");
    }
}

class Demo2 {

    public void display() {
        System.out.println("display method in demo2 is invoked");
    }
}