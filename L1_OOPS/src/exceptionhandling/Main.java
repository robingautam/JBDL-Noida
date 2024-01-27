package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        try {
            getData1();
        }
        catch (Exception e){
            System.out.println("not found from 1st api, calling another");
            getData2();
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Rest of the code");
    }

    public static void getData1(){
        int c = 10/0;
    }
    public static void getData2(){
        System.out.println("Data Successfully fetched");
    }
}


