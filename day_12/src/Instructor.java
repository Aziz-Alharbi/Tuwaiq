public class Instructor extends Person {


    private int  salary;


    public Instructor(String name, int age, String email, String phone, int salary) {
        super(name, age, email, phone);
    }


    public void setSalary(int salary){
        this.salary = salary;

    }

    public int getSalary(){
        return salary;
    }



}
