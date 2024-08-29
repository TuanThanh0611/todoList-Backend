package com.Ivo.todoListBackend.service;

import com.Ivo.todoListBackend.model.TodoItem;
import com.Ivo.todoListBackend.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TodoItemImpl implements TodoItemService{
    @Autowired
    private TodoRepo todoRepo;
    public List<TodoItem> getAllItems(){
        return todoRepo.findAll();
    }
    public TodoItem getItem(Long id){
        return todoRepo.findById(id).orElse(null);
    }
    public TodoItem createTodoItem(TodoItem item){
        return todoRepo.save(item);
    }

}
