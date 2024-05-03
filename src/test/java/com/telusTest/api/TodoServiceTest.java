package com.telusTest.api;

import com.telusTest.api.model.Todo;
import com.telusTest.api.persistance.TodoRepository;
import com.telusTest.api.service.TodoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TodoServiceTest {

    @Mock
    TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @Test
    public void testCreateItem() {

        // ...
    }

    @Test
    public void testFindAllTodo(){
        List<Todo> list = new ArrayList<Todo>();
        Todo tdOne = new Todo(1, "desc", "compDesc");
        Todo tdTwo = new Todo(2, "desc2", "compDesc2");
        Todo tdThree = new Todo(3, "desc3", "compDesc3");

        list.add(tdOne);
        list.add(tdTwo);
        list.add(tdThree);

        when(todoRepository.findAll()).thenReturn(list);

        //test
        List<Todo> todoList = todoService.allTodo();
        assertEquals(3, todoList.size());
        verify(todoRepository, times(1)).findAll();

    }

    @Test
    void testCreateTodo() {
        Todo tdOne = new Todo(1, "desc", "compDesc");
        todoService.addTodo(tdOne);
        verify(todoRepository, times(1)).insert(tdOne);
    }

    @Test
    void testDeleteTodo() {
        todoService.deleteTodo(1);
        verify(todoRepository, times(1)).removeById(1);
    }
}
