package com.thesamoanppprogrammer.GroovySpringBootTemplates.controller

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.ApiTodo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.service.ApiService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('api/todos')
public class ApiController {

    @Autowired
    ApiService apiService

    @GetMapping
    List<ApiTodo> getAllTodosList(){
        apiService.findAll()
    }

    @PostMapping
    ApiTodo saveTodo(@RequestBody ApiTodo todo){
        apiService.saveTodo todo
    }

    @PutMapping
    ApiTodo updateTodo(@RequestBody ApiTodo todo){
        apiService.updateTodo todo
    }

    @DeleteMapping('/{todoId}')
    deleteTodo(@PathVariable Integer todoId){
        apiService.deleteTodo todoId
    }

    @GetMapping('/{todoId}')
    ApiTodo getTodoById(@PathVariable Integer todoId){
        apiService.findById todoId
    }
}


