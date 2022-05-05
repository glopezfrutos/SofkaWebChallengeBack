package com.sofkau.todolist.service;

import com.sofkau.todolist.entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
