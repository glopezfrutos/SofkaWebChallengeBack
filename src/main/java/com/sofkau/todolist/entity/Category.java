package com.sofkau.todolist.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "Category")
@Table(name = "category")
@Data
public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;

        @OneToMany(
                cascade = CascadeType.ALL,
                fetch = FetchType.EAGER
        )
        private List<Note> notes = new ArrayList<>();

        public Category addNote(Note note){
                this.notes.add(note);
                return this;
        }
    }
