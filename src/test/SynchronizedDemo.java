package test;

public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=100; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=1; i<=100; i++)
                c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(c.getCount());

    }
}

class Counter{
    private int count;

    public synchronized  void increment(){
        try{ Thread.sleep(10);} catch (Exception e){}
        this.count++;
    }

    public int getCount(){ return this.count; }
}
