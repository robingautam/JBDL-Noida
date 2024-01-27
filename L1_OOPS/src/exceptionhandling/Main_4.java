package exceptionhandling;

public class Main_4 {
    public static void main(String[] args) {
        m3();
        System.out.println("Rest of the code");
    }

    public static void m(){
        int c = 10/0;
    }
    public static void m2(){
        m();
    }
    public static void m3(){
        try {
            m2();
        }
        catch (Exception e){

        }
    }
}
