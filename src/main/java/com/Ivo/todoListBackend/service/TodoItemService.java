package com.Ivo.todoListBackend.service;

import com.Ivo.todoListBackend.model.TodoItem;
import com.Ivo.todoListBackend.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoItemService  {
     List<TodoItem> getAllItems();
     TodoItem getItem(Long id);
     TodoItem createTodoItem(TodoItem item);


}
