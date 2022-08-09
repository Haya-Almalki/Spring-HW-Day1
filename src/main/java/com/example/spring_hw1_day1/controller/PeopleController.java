package com.example.spring_hw1_day1.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {

    ArrayList<String> names=new ArrayList<>();
    @GetMapping("/name")
    public ArrayList getNames(){
        return names;
    }

    @PostMapping("/name")
    public void addName(@RequestBody String name){
        names.add(name);
    }
    @PutMapping("/name/{index}")
    public void updateName(@PathVariable int index, @RequestBody String name){
        names.set(index,name);
    }
    @DeleteMapping("/name/{index}")
    public void deleteName(@PathVariable int index){
        names.remove(index);
    }
}
