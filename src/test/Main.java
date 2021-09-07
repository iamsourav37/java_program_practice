package test;



public class Main {
    public static void main(String[] args) {

        Parent s = new Child();

        s.display("12");
        s.sayHii("Sourav");

        Child c = new Child();

        c.display("Java");
        c.display(13);

    }
}




class Parent{

    public Parent(){
        System.out.println("Super class constructor is invoked");
    }

    public Parent(String s){
        this();
        System.out.println("Overloaded super class constructor is invoked, "+s);
    }

    public void display(String s){
        System.out.println("hello super");
    }

    public void sayHii(String name){
        System.out.println("Hiii there "+ name);
    }
}
class Child extends Parent  {

    public Child(){
        super("Raja");
        System.out.println("Sub class constructor is invoked");
    }

    public void display(int t){
        System.out.println("hello sub");
    }

    public void sayHello(String name){
        System.out.println("hello "+name);
    }


}



