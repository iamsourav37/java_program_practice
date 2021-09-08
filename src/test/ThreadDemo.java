package test;

public class ThreadDemo {


    public static void main(String[] args) throws InterruptedException {

        Example obj1 = new Example();
        Example2 obj2 = new Example2();

        obj1.setName("t-Example");
        obj2.setName("t-Example2");

        obj1.start();
        obj2.start();


        obj1.join();
        obj2.join();

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

        for(int i=0; i<10; i++)
            System.out.println("in main thread : "+ i);


    }
}

class Example extends Thread  {


   public void show() throws Exception{

       for(int i=0; i<10; i++){
           System.out.println("Example class : "+(i+1));
           Thread.sleep(100);
       }
   }
    public void run() {
        try {
            this.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Example2 extends Thread{


    public void show() throws Exception{
        for(int i=0; i<10; i++){
            System.out.println("Example2 class : "+(i+1));
            Thread.sleep(100);

        }
    }

    public void run(){
        try {
            this.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}