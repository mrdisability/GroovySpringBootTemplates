package com.thesamoanppprogrammer.GroovySpringBootTemplates.repository

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.ApiTodo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApiRepository extends JpaRepository<ApiTodo, Integer> {}
