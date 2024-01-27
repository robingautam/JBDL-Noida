package Abstraction;

public class Main {
    public static void main(String[] args) {
       /* MakeTest obj = new MakeTest();
        obj.doVoice(new Cat());*/
        Person p = new Person();
        p.dob("20011998");
    }

}
class MakeTest {
    public void doVoice(Animal a){
        a.makeNoise();
    }
}
