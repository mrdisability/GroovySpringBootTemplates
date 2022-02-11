package com.thesamoanppprogrammer.GroovySpringBootTemplates.repository

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.PagingAndSortingRepository

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>,
        JpaSpecificationExecutor<Todo> {
}
