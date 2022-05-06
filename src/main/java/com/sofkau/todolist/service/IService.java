package com.sofkau.todolist.service;

import com.sofkau.todolist.entity.Category;
import com.sofkau.todolist.entity.Note;

import java.util.List;

public interface IService {
    Category saveCategory(Category category);

    Category saveNote(Note note);

    Note updateNote(Note note);

    Category updateCategory(Category category);

    void deleteNote(Long id);

    void deleteCategory(Long id);

    List<Category> getCategories();
}
