package com.example.exercise_day_20.Controller;

import com.example.exercise_day_20.ApiResponse;
import com.example.exercise_day_20.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class TaskController {

    //Create a new task (title , description , status)


    // Display all tasks .
    //Update a task
    //Delete a task
    //Change the task status as done or not done
    //Search for a task by given title


    ArrayList<Task> tasks = new ArrayList<>();
    int id = 1;

    @GetMapping("/get")
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    @PostMapping("/add")
    public ApiResponse addTask(@RequestBody Task task) {
        task.setId(id++);
        tasks.add(task);
      //  return "Task added!";
        return new ApiResponse("Task added!", 200);
    }

    @PutMapping("/update/{index}")
    public ApiResponse updateTask(@PathVariable int index, @RequestBody Task task) {
        task.setId(tasks.get(index).getId());
        tasks.set(index, task);
        return new ApiResponse("Task updated!", 200);
    }

    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteTask(@PathVariable int index) {
        tasks.remove(index);
        return new ApiResponse("Task deleted!", 200);
    }

    @PutMapping("/status/{index}")
    public ApiResponse changeStatus(@PathVariable int index) {
        Task task = tasks.get(index);
        task.setStatus(!task.isStatus());
        return new ApiResponse("Status updated!", 200);
    }

    @GetMapping("/search/{title}")
    public Task searchByTitle(@PathVariable String title) {
        for (Task t : tasks) {
            if (t.getTitle().equalsIgnoreCase(title)) return t;
        }
        return null;
    }




}
