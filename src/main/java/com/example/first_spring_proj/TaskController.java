package com.example.first_spring_proj;

import com.example.first_spring_proj.data.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/task")
public class TaskController {

/*
Build a "Task Manager" API that dows the following
1. Create a task(With following attributes
    -Title
    -Due Dates
    -Status(Pending , In progress,completed)
 2. Update a task
 3.Delete a task
 4.List all tasks

*/


    ArrayList<Task> tasks=new ArrayList<>();

    public TaskController(ArrayList<Task> tasks) {
        this.tasks = tasks;
        //sample data for testing
        this.tasks.add(new Task("Task1",new Date(),false));
        this.tasks.add(new Task("Task2",new Date(),true));
        this.tasks.add(new Task("Task3",new Date(),true));
        this.tasks.add(new Task("Task4",new Date(),false));
        this.tasks.add(new Task("Task5",new Date(),false));

    }

    @GetMapping("")
    public ArrayList<Task> getAllTasks(){
        return tasks;
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Integer id){

        return tasks.get(id);
    }


}


