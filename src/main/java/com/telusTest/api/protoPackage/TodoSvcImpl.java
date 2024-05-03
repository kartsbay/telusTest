package com.telusTest.api.protoPackage;

import com.telusTest.api.model.Todo;
import io.grpc.stub.StreamObserver;
import com.telusTest.api.service.TodoService;


import java.util.List;

import static com.telusTest.api.protoPackage.TelusTodoObj.*;

public class TodoSvcImpl extends TodoSvcGrpc.TodoServiceImplBase{
    TodoService todoService;

    public TodoSvcImpl(TodoService todoService){
        this.todoService = todoService;
    }
    /**
     * get todo by id
     */
    public void getTodo(GetTodoRequest request,
                        StreamObserver<TodoResponse> responseObserver) {
        int id = request.getId();
        Todo todo = todoService.getTodo(id) != null ? todoService.getTodo(id) : new Todo();
        TodoResponse todoResponse = TodoResponse.newBuilder().
                setCompletionStatus(todo.getCompletionStatus()).
                setDescription(todo.getDescription()).
                setId(todo.getId()).build();
        responseObserver.onNext(todoResponse);

        // Indicate that no further messages will be sent to the client.
        responseObserver.onCompleted();

    }

    /**
     * get all todo
     */
    public void getAllTodo(Empty request,
                           StreamObserver<TodoResponse> responseObserver) {
        List<Todo> todoLst = todoService.allTodo();
        for(Todo todo : todoLst){
            TodoResponse todoResponse = TodoResponse.newBuilder().
                    setCompletionStatus(todo.getCompletionStatus()).
                    setDescription(todo.getDescription()).
                    setId(todo.getId()).build();
            responseObserver.onNext(todoResponse);
        }
        responseObserver.onCompleted();
    }

    /**
     * update todo by id
     */
    public void updateTodo(TelusTodoObj.TodoReq request,
                           io.grpc.stub.StreamObserver<TodoResponse> responseObserver) {
        int id = request.getId();
        Todo todoreq = new Todo(request.getId() , request.getDescription(), request.getCompletionStatus());
        Todo todo = todoService.updateTodo(todoreq, id);
        TodoResponse todoResponse = TodoResponse.newBuilder().
                setCompletionStatus(todo.getCompletionStatus()).
                setDescription(todo.getDescription()).
                setId(todo.getId()).build();
        responseObserver.onNext(todoResponse);

        // Indicate that no further messages will be sent to the client.
        responseObserver.onCompleted();
    }

    /**
     * delete todo
     */
    public void deleteTodo(GetTodoRequest request,
                           io.grpc.stub.StreamObserver<Empty> responseObserver) {
        int id = request.getId();
        todoService.deleteTodo(id);
        Empty emptyRes = Empty.newBuilder().build();
        responseObserver.onNext(emptyRes);

        // Indicate that no further messages will be sent to the client.
        responseObserver.onCompleted();


    }

}

