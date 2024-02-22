package ProdConsProblem;

public class Main {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        producer.start();
        consumer.start();
    }
}
