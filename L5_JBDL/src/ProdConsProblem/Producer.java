package ProdConsProblem;

public class Producer extends Thread{
    SharedData data;
    Producer(){}
    Producer(SharedData data){
        this.data =data;
    }
    @Override
    public void run(){
        for (int i=1;i<=10;i++){
           // System.out.println("Data Produced: "+i);
            data.produce(i);
        }
    }
}
