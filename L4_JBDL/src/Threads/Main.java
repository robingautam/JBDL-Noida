package Threads;

public class Main {
    public static void main(String[] args) {
        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();

        t2.start();*/
        //int c = 10/0;
      //  maths m = new maths();
        //m.run();

       /* Runnable t = new tUsingRunnable();
        //t.start();
        Thread thread = new Thread(t);
        thread.start();*/

      /*  Runnable r = ()->{
            System.out.println("Runnable using lambda");
        };

        Thread t = new Thread(r);
        t.start();*/

        SleepExample sl = new SleepExample();
        sl.start();

        sl.start();


    }
}
class MyThread extends Thread {
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}

class maths extends Thread {

    @Override
            public void run(){
        int c = 10/0;
    }


}

class tUsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside Run Method()");
    }
}

class SleepExample extends Thread {
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}