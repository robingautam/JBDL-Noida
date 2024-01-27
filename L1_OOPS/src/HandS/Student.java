package HandS;

public class Student {
    int id;
    int age;
    String name;

    @Override
    public String toString(){
        return "[Student: age: "+age+" , name:"+name;
    }
    @Override
    public boolean equals(Object o){
        Student s = (Student) o;
        return s.id==this.id;
    }
}
