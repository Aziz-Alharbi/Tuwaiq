package com.example.lab5.Controller;

import com.example.lab5.Api.ApiResponse;
import com.example.lab5.Model.Project;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/Tracker")

public class TrackerController {



    ArrayList<Project> projects = new ArrayList<>();



    @PostMapping("/Project")
    public Project createProject(@RequestBody Project project) {


        projects.add(project);


        return project;
    }


    @GetMapping("/Projects")
    public ArrayList<Project> getProjects() {

        return projects;
    }


    @PutMapping("/Updating/{id}")
    public ApiResponse updateProjects(@RequestBody Project newProject, @PathVariable String id) {


        for (Project project : projects) {
            if (project.getId().equals(id)) {
                project.setTitle(newProject.getTitle());
                project.setCompanyName(newProject.getCompanyName());
                project.setDescription(newProject.getDescription());
                project.setStatus(newProject.isStatus());
                return
                        new ApiResponse("Project updated successfully !" , 200)

                        ;
            }
        }

        return
                new ApiResponse("Project not found !" , 200)

                ;
    }

    @DeleteMapping("Deleting")
    public ApiResponse deleteProject(@PathVariable int index) {

        projects.remove(index);


        return
                new ApiResponse("Project deleted successfully !" , 200)

                ;
    }

    @GetMapping("/Checking")
    public ApiResponse checking(@RequestBody Project project) {


        if (project.isStatus()) {
            project.setStatus(false);
        }else {
            project.setStatus(true);

        }



        return
                new ApiResponse("Project marked successfully !" , 200)

                ;
    }


    @GetMapping("/project/search/{title}")
    public String searching(@PathVariable String title){

        for(Project project : projects){

            if (project.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Project : " + project);
            }
        }
        return "Project has been found !";

    }


    ArrayList <Project> company = new ArrayList<>();


    @GetMapping("/Project/{companyName}")
    public ArrayList<Project> allProjects(@PathVariable String companyName){

        for(Project project : projects){

            if (project.getCompanyName().equals(companyName)){

                company.add(project);

            }
        }

        return company;

    }






}
