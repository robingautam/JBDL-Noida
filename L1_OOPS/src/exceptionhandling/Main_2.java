package exceptionhandling;

public class Main_2 {
    public static void main(String[] args) {
        try {
            Divide(10,0);
        }
        catch (Exception e){

        }
        System.out.println("rest of the code");
    }
    public static void Divide(int first, int num) {
        if (num==0){
            throw new ArithmeticException("num should be greater than 0");
        }
        System.out.println(first/num);
    }
}
