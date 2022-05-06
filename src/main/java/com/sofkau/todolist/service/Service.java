package com.sofkau.todolist.service;

import com.sofkau.todolist.entity.Category;
import com.sofkau.todolist.entity.Note;
import com.sofkau.todolist.repository.CategoryRepository;
import com.sofkau.todolist.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service implements IService {
    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category saveNote(Note note) {
        Category category = categoryRepository.findById(note.getFkCategoryId()).get();
        category.addNote(note);
        noteRepository.save(note);
        return categoryRepository.save(category);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public void deleteCategory(Long id) {
        Category categoryToBeDeleted = categoryRepository.findById(id).get();
        if(categoryToBeDeleted.getNotes().size() >= 0){
            categoryToBeDeleted.getNotes().forEach(note -> noteRepository.deleteById(note.getId()));
        }
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
