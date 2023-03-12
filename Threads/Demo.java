class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // waiting stage
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority()); // we can only suggest to the CPU but
        // it may have different alg like small jobs
        // System.out.println(obj2.getPriority());

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();


        /*
         A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
         */
    }
}