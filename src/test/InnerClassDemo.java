package test;

public class InnerClassDemo {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.display();

    }
}


class Demo{
    void display(){
        class InnerLocalClass{
            final private int data;

            public InnerLocalClass(int data){
                this.data = data;
            }

            public void display(){
                System.out.println("This is local inner class demo");
                System.out.println("data is : "+ this.data);
            }
        }

        InnerLocalClass obj = new InnerLocalClass(101);

        obj.display();
    }


}
