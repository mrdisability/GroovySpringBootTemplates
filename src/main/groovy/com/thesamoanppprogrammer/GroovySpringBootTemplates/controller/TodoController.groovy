package com.thesamoanppprogrammer.GroovySpringBootTemplates.controller

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.service.TodoService
import org.hibernate.annotations.common.util.impl.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.env.Environment
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

import java.util.logging.Logger

@Controller
public class TodoController {

    //private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final int ROW_PER_PAGE = 5;

    @Autowired
    private Environment env;

    @Autowired
    private TodoService todoService;

//    @Value("${msg.title}")
//    private String title;

    @GetMapping(value = ["/", "/index"])
    public String index(Model model) {
        model.addAttribute("title", env.getProperty("msg.title"));
        return "index";
    }

//    @GetMapping(value = "/todos")
//    public String getTodos(Model model,
//                            @RequestParam(value = "page", defaultValue = "1") int pageNumber) { ... }
//
//    @GetMapping(value = "/todos/{todoId}")
//    public String getTodoById(Model model, @PathVariable long TodoId) { ... }
//
//    @GetMapping(value = ["/todos/add"])
//    public String showAddTodo(Model model) {
//        Todo todo = new Todo();
//        model.addAttribute("add", true);
//        model.addAttribute("todo", todo);
//        model.addAttribute("actionUrl", "/todos/add");
//
//        return "todo-edit";
//    }
//
//    @PostMapping(value = "/todos/add")
//    public String addTodo(Model model,
//                           @ModelAttribute("todo") Todo Todo) { ... }
//
//    @GetMapping(value = ["/todos/{todoId}/edit"])
//    public String showEditTodo(Model model, @PathVariable long TodoId) { ... }
//
//    @PostMapping(value = ["/todos/{todoId}/edit"])
//    public String updateTodo(Model model,
//                              @PathVariable long todoId,
//                              @ModelAttribute("todo") Todo todo) { ... }
//
//    @GetMapping(value = ["/todos/{todoId}/delete"])
//    public String showDeleteTodoById(
//            Model model, @PathVariable long todoId) { ... }
//
//    @PostMapping(value = ["/todos/{todoId}/delete"])
//    public String deleteTodoById(
//            Model model, @PathVariable long todoId) { ... }
}
