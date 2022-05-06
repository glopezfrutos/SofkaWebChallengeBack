package com.sofkau.todolist.controller;

import com.sofkau.todolist.entity.Category;
import com.sofkau.todolist.entity.Note;
import com.sofkau.todolist.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping("get")
    public List<Category> getAll(){
        return service.getCategories();
    }

    @PostMapping("save/category")
    public Category saveCategory(@RequestBody Category category){
        return service.saveCategory(category);
    }

    @PostMapping("save/note")
    public Category saveNote(@RequestBody Note note){
        return service.saveNote(note);
    }

    @PutMapping("update/category")
    public Category updateCategory(@RequestBody Category category){
        return service.updateCategory(category);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return service.updateNote(note);
    }

    @DeleteMapping("delete/category/{id}")
    public void deleteCategory(@PathVariable Long id) {
        service.deleteCategory(id);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }
}
