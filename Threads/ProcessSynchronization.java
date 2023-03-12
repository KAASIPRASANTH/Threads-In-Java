class A {
    int count = 0;

    
    //for synchronize the increament the data include this
    /* 
    public synchronized void increament() {
        count++;
    }
    */
    public void increament() {
        count++;
    }
}

public class ProcessSynchronization {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increament();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increament();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.count);
    }
}
