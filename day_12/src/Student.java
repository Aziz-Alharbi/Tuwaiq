

public class Student extends Person {


    int age;
    String name;
    double GPA;
    String email;
    String phone;




    public Student (String name, int age, double GPA, String email, String phone) {
        super(name, age, email, phone);

        this.age = age;
        this.name = name;
        this.GPA = GPA;
        this.email = email;
        this.phone = phone;

    }





    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGPA() {
        return GPA;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

}
