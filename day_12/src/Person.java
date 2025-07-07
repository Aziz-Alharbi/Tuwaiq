public class Person {


    private String name;

    private int age;

    private String email;

    private String phone;




    public Person(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;

    }



    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }


    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }


}
