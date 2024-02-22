package ProdCons2;

public class Consumer extends Thread{
    SharedData data;
    Consumer(){}
    Consumer(SharedData data){
        this.data = data;
    }

    @Override
    public void run(){
        for (int i=1;i<=10;i++){
           data.consume();
        }
    }
}
