import java.awt.geom.GeneralPath;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        Student s6 = new Student(18, "name", 4.4, "Stringemail" ,"String phone");


//        if(s6.getAge() < 18){
//            System.out.println("young");
//        }
//        else {
//            System.out.println("old");
//        }
//
//
//        if(s6.getName().length() < 3 ){
//            System.out.println("short");
//        } else if (s6.getName().length() < 5 && s6.getName().length() > 3) {
//
//            System.out.println("medium");
//        }
//        else {
//            System.out.println("long");
//        }
//
//        if(s6.getGPA() > 3.5){
//            System.out.println("Excellent");
//
//        }
//        else {
//            System.out.println("Try again");
//        }
//
//        if (s6.getEmail().toLowerCase().contains("@")){
//
//            System.out.println("Email valid");
//        }
//        else {
//            System.out.println("Email invalid");
//        }
//
//        if(s6.getPhone().length() != 11 || !s6.getPhone().startsWith("05")){
//            System.out.println("Phone number invalid");
//        }
//        else {
//            System.out.println("Phone number valid");
//        }

//        s1.name = "Aziz";
//        s1.age = 18;
//        s1.GPA = 5.0;
//        s1.phone= "0566366273";
//
//        System.out.println();
//        System.out.println("The first student name is " + s1.name + " and age is " + s1.age + " and GPA is " + s1.GPA);


        s1.setName("Aziz");
        s1.setAge(23);
        s1.setPhone("055666348");
        s1.setEmail("aziz@gmail.com");
        s1.setGPA(4.4);

        s2.setName("Mohammed");
        s2.setAge(33);
        s2.setPhone("0555555555");
        s2.setEmail("Mohammed@gmail.com");
        s2.setGPA(3.0);

        s3.setName("Kalid");
        s3.setAge(26);
        s3.setPhone("05644877554");
        s3.setEmail("Kalid@gmail.com");
        s3.setGPA(3.8);

        s4.setName("Noah");
        s4.setAge(28);
        s4.setPhone("05443134669");
        s4.setEmail("Noah@gmail.com");
        s4.setGPA(3.0);

        s5.setName("Yasir");
        s5.setAge(19);
        s5.setPhone("05555555555");
        s5.setEmail("Yasir@gmail.com");
        s5.setGPA(4.4);

//        System.out.println(s1.getName() + " , " + s1.getAge()+ " , " + s1.getPhone()+ " , " + s1.getEmail()+ " , " + s1.getGPA());
//        System.out.println(s2.getName() + " , " + s2.getAge()+ " , " + s2.getPhone()+ " , " + s2.getEmail()+ " , " + s2.getGPA());
//        System.out.println(s3.getName() + " , " + s3.getAge()+ " , " + s3.getPhone()+ " , " + s3.getEmail()+ " , " + s3.getGPA());
//        System.out.println(s4.getName() + " , " + s4.getAge()+ " , " + s4.getPhone()+ " , " + s4.getEmail()+ " , " + s4.getGPA());
//        System.out.println(s5.getName() + " , " + s5.getAge()+ " , " + s5.getPhone()+ " , " + s5.getEmail()+ " , " + s5.getGPA());





        Account acc = new Account("A101", "Aziz", 500);
        System.out.println(acc);






    }







}