package todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todo.model.Todo;
import todo.service.TodoService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

   @RequestMapping(method = RequestMethod.GET, value = "/todos")
   public List<Todo> getTodos(){
       return todoService.getTodos();
   }

    @RequestMapping(method = RequestMethod.POST, value = "/todos")
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value= "/todo/{id}")
    public void deleteTodo(@PathVariable Integer id){ todoService.deleteTodo(id); }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void updateCar(@RequestBody Todo todo, @PathVariable Integer id){
        todoService.update(todo, id);
    }
}
