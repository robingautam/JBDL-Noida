public class Student extends Object {
    private int id;
    private String name;
   private String email;
   private int age;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        if (age<0){
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
