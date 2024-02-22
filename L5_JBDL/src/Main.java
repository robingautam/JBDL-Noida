public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyThread t = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t.setName("My Thread 1");
       /* System.out.println("Name: "+t.getName());
        System.out.println("Name: "+t2.getName());
        System.out.println("Name: "+t3.getName());*/
        System.out.println(t.getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run(){

    }
}