package com.thesamoanppprogrammer.GroovySpringBootTemplates.service

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.ApiTodo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo

interface ApiService {

    List<ApiTodo> findAll()

    ApiTodo findById(Integer todoId)

    ApiTodo saveTodo(ApiTodo todo)

    ApiTodo updateTodo(ApiTodo todo)

    ApiTodo deleteTodo(Integer todoId)
}
