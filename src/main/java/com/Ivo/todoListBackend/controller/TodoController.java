package com.Ivo.todoListBackend.controller;

import com.Ivo.todoListBackend.model.TodoItem;
import com.Ivo.todoListBackend.service.TodoItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoItemService todoItemService;

    public TodoController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/getAll")
    public List<TodoItem> getAllItems(){
        return todoItemService.getAllItems();
    }
    @PostMapping
    public TodoItem createTodoItemm(@RequestBody TodoItem itemm){
        return todoItemService.createTodoItem(itemm);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<TodoItem> getItem(@PathVariable Long id ){
        TodoItem item=todoItemService.getItem(id);
        if(item!= null){
            return ResponseEntity.ok(item);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
