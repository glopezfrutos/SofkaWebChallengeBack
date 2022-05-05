package com.sofkau.todolist.controller;

import com.sofkau.todolist.entity.Note;
import com.sofkau.todolist.service.NoteService;
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
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("get/notes")
    public List<Note> getAllNotes(){
        return noteService.getNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note){
        return noteService.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return noteService.updateNote(note);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}
