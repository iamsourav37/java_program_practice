package test;



class B{
    public static void main(String[] args) {

    }
}

class Person{
     private String name;

     public Person(){
         System.out.println("Default constructor");
     }
     public Person(String name){
         this.name = name;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void disp(){
        System.out.println("Name : "+ this.name);
    }
}