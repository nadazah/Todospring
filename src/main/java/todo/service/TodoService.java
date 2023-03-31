package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.Todo;
import todo.repository.TodoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodos() {
        List<Todo>  todos = new ArrayList<>();
        todoRepository.findAll().forEach(todo -> {
            todos.add(todo);
        });
        return todos;
    }

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(int id) {

        todoRepository.deleteById(id);
    }

    public void update(Todo todo, Integer id) {
        todoRepository.save(todo);
    }
}
