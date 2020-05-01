package com.ico.ltd.todo.repository;

import com.ico.ltd.todo.model.ToDoItem;

import java.util.List;

public interface ToDoRepository {
    List<ToDoItem> findAll();

    ToDoItem findById(Long id);

    Long insert(ToDoItem toDoItem);

    void update(ToDoItem toDoItem);

    void delete(ToDoItem toDoItem);
}
