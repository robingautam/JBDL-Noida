package exceptionhandling;

import java.io.IOException;

public class Main_3 {

    public static void main(String[] args) {

    }
    public static void getData() throws IOException{
      throw new IOException("IO Exception");
    }
}
