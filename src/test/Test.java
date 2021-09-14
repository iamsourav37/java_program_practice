package test;

public class Test {

    public static void main(String[] args) {

        Employee e = new Employee(101);

        Employee e2 = e.clone();

        e2.id = 102;

        System.out.println(e.id);
        System.out.println(e2.id);



    }
}

class Employee implements Cloneable{

    int id;

    public Employee(int id){
        this.id = id;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
