public class Employee {


    String id;

    String name;

    int salary;


    public Employee(String id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }


    public String getId() {
        return id;

    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raisedSalary(int percent) {
        salary += (salary * percent) / 100;
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }



    public String toString() {
        return id + " " + name + " " + salary;
    }

}
