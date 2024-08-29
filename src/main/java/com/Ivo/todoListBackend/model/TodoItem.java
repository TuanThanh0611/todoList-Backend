package com.Ivo.todoListBackend.model;

import jakarta.persistence.*;

@Entity
@Table(name="todo_items")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    private boolean completed;

    public TodoItem(Long id, String title,String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.description=description;
        this.completed = completed;
    }

    public TodoItem() {

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean iscompleted() {
        return completed;
    }
}
