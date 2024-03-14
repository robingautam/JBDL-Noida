import com.google.gson.Gson;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student st = new Student(1,"rob","rob@gmail");
        Gson gson = new Gson();
        System.out.println(gson.toJson(st));



    }
}