package com.example.lab5.Controller;

import com.example.lab5.Api.ApiResponse;
import com.example.lab5.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/student")

public class TrackerController {


    //• Create a new student (ID, name, age, degree, GPA)
    //• Display all students.
    //• Update a student
    //• Delete a student
    //• Based on GPA, classify students into honors categories.
    //• Display a group of students whose GPA is greater than the average
    //GPA.


    ArrayList <Student> students = new ArrayList<>();
    ArrayList <Student> bestStudents = new ArrayList<>();
    ArrayList <Student> secondStudents = new ArrayList<>();
    ArrayList <Student> thirdStudents = new ArrayList<>();


    @PostMapping("/Student")
    public Student addStudent(@RequestBody Student student){


        students.add(student);


        return student;
    }

    @GetMapping("/Students")
    public ArrayList<Student> getStudents(){

        return students;
    }

    @PutMapping("/Updating/{id}")
    public ApiResponse updateStudent(@RequestBody Student newStudent, @PathVariable String id){


        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(newStudent.getName());
                student.setName(newStudent.getName());
                student.setAge(newStudent.getAge());
                student.setDegree(newStudent.getDegree());
                student.setGpa(newStudent.getGpa());
                return
                        new ApiResponse("Student updated successfully !" , 200)

                        ;
            }
        }

        return
                new ApiResponse("Student not found !" , 200)

                ;
        }

    @DeleteMapping("Deleting")
    public ApiResponse deleteStudent (@PathVariable int index){

        students.remove(index);



        return
                new ApiResponse("Student deleted successfully !" , 200)

                ;
        }


    @GetMapping("/Classification")
    public ApiResponse classifyGPA(@PathVariable double GPA){


        if(GPA > 3.5){
            return
                    new ApiResponse("1st Class honor !" , 200)

                    ;
        }
        else if (3.5 > GPA && GPA > 2.5){

            return
                    new ApiResponse("2nd Class honor !" , 200)

                    ;
        } else if (2.5 > GPA) {

            return
                    new ApiResponse("3rd Class honor !" , 200)

                    ;
        }
        else{
            return
                    new ApiResponse("invalid GPA !" , 200)

                    ;
        }

    }

    @GetMapping("/Highest")
    public ArrayList<Student> getBestStudents() {


        for (Student student : students) {


            if (student.getGpa() > 3.5) {
                bestStudents.add(student);
            } else if (student.getGpa() < 3.5 && student.getGpa() > 2.5) {

                secondStudents.add(student);
            } else if (student.getGpa() < 2.5) {
                thirdStudents.add(student);
            }

        }


        if (bestStudents.isEmpty() && !secondStudents.isEmpty()) {
            return secondStudents;
        } else if (!bestStudents.isEmpty()) {
            return bestStudents;
        } else if (bestStudents.isEmpty() && secondStudents.isEmpty() && !thirdStudents.isEmpty()) {
            return thirdStudents;
        } else {
            return bestStudents;
        }

    }





}
