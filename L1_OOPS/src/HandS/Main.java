package HandS;

public class Main extends Object {

    public static void main(String[] args) {
        Student s = new Student();
        s.name ="Ram";
        s.age = 23;
        Student s2 = new Student();
        s2.age = 23;
        s2.name = "Ram";
       // System.out.println(s.equals(s2));
       // System.out.println(s.hashCode());
        Student obj1 = new Student();
        obj1.id = 10;

        Student obj2 = new Student();
        obj2.id = 10;

        Student obj3 = new Student();
        obj3.id = 30;

        System.out.println(obj1.equals(obj1));
    }
}
