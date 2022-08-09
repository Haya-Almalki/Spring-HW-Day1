package com.example.spring_hw1_day1.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {
    ArrayList<Integer> grades=new ArrayList<Integer>();
    @GetMapping("/grade")
    public ArrayList getGrade(){
        return grades;
    }

    @PostMapping("/grade")
    public void addGrade(@RequestBody String grade){
        int grade1=Integer.parseInt(grade);
        grades.add(grade1);
    }
    @PutMapping("/grade/{index}")
    public void updateGrade(@PathVariable int index,@RequestBody String grade){
        int grade1=Integer.parseInt(grade);
        grades.set(index,grade1);
    }
    @DeleteMapping("/grade/{index}")
    public void deleteGrade(@PathVariable int index){
        grades.remove(index);
    }
}
