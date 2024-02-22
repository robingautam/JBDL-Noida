package ProdConsProblem;

public class SharedData {
    int data;
    boolean isProduced = true;
    public synchronized void produce(int d){
        if (isProduced==false){
            try {
                wait();
            }
            catch (Exception ex){

            }
        }
        this.data = d;
        System.out.println("Data Produced: {}"+data);
        isProduced = false;
        notify();

    }

    public synchronized int consume(){
        if (isProduced==true){
            try {
                wait();
            }
            catch (Exception ex){

            }
        }
        isProduced = true;
        notify();
        return data;
    }
}
