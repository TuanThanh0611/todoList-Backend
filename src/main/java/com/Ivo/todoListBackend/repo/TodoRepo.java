package com.Ivo.todoListBackend.repo;

import com.Ivo.todoListBackend.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem,Long> {
}
