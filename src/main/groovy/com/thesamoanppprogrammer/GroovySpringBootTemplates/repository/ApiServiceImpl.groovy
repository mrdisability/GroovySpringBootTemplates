package com.thesamoanppprogrammer.GroovySpringBootTemplates.repository

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.ApiTodo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.service.ApiService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ApiServiceImpl implements ApiService {

    @Autowired
    ApiRepository todoRepository

    @Override
    List<ApiTodo> findAll() {
        todoRepository.findAll()
    }

    @Override
    ApiTodo findById(Integer todoId) {
        todoRepository.findById todoId get()
    }

    @Override
    ApiTodo saveTodo(ApiTodo todo){
        todoRepository.save todo
    }

    @Override
    ApiTodo updateTodo(ApiTodo todo){
        todoRepository.save todo
    }

    @Override
    ApiTodo deleteTodo(Integer todoId){
        todoRepository.deleteById todoId
    }
}

