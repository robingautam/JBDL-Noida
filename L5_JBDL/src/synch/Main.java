package synch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Table t = new Table();
        MyThread t1 = new MyThread(t);
        MyThread2 t2 = new MyThread2(t);
      /*  t1.start();
        t2.start();*/
       // t1.join();
        MyThread3 thread3 = new MyThread3();
      /*  thread3.start();
        thread3.join();
        for (int i=0;i<=10;i++){
            System.out.println(i+" Main");
        }*/
        thread3.start();
        thread3.join();

    }
}
class MyThread extends Thread {
    Table t;
    MyThread(){};
    MyThread(Table t){
        this.t = t;
    }
    @Override
    public void run(){
        t.display(2);
    }
}
class MyThread2 extends Thread {
    Table t;
    MyThread2(){};
    MyThread2(Table t){
        this.t = t;
    }
    @Override
    public void run(){
        t.display(3);
    }
}
class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            currentThread().join();
        } catch (Exception e) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i + " Thread 3");
                }
            }
        }
    }