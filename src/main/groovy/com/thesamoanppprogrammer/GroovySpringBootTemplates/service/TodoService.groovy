package com.thesamoanppprogrammer.GroovySpringBootTemplates.service

import com.thesamoanppprogrammer.GroovySpringBootTemplates.entity.Todo
import com.thesamoanppprogrammer.GroovySpringBootTemplates.repository.TodoRepository
import org.codehaus.groovy.util.StringUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import org.springframework.util.StringUtils

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    private boolean existsById(Integer id) {
        return todoRepository.existsById(id);
    }

    public Todo findById(Integer id) throws Exception {
        Todo todo = todoRepository.findById(id).orElse(null);
        if (todo==null) {
            throw new Exception("Cannot find Todo with id: " + id);
        }
        else return todo;
    }

    public List<Todo> findAll(int pageNumber, int rowPerPage) {
        List<Todo> todos = new ArrayList<>();
        Pageable sortedByIdAsc = PageRequest.of(pageNumber - 1, rowPerPage,
                Sort.by("id").ascending());
        todoRepository.findAll(sortedByIdAsc).forEach(todos::add);
        return todos;
    }

    public Todo save(Todo todo) throws Exception {
        if (!StringUtils.isEmpty(todo.getTitle())) {
            if (todo.getId() != null && existsById(todo.getId())) {
                throw new Exception("Todo with id: " + todo.getId() +
                        " already exists");
            }
            return todoRepository.save(todo);
        }
        else {
            throw new Exception("Title cannot be null or empty");
        }
    }

    public void update(Todo todo) throws Exception {
        if (!StringUtils.isEmpty(todo.getTitle())) {
            if (!existsById(todo.getId())) {
                throw new Exception("Cannot find Todo with id: " + todo.getId());
            }
            todoRepository.save(todo);
        }
        else {
            throw new Exception("Title cannot be null or empty");
        }
    }

    public void deleteById(Integer id) throws Exception {
        if (!existsById(id)) {
            throw new Exception("Cannot find Todo with id: " + id);
        }
        else {
            todoRepository.deleteById(id);
        }
    }

    public Long count() {
        return todoRepository.count();
    }
}
