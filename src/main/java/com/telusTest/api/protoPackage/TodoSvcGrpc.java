package com.telusTest.api.protoPackage;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: TelusTodo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TodoSvcGrpc {

  private TodoSvcGrpc() {}

  public static final String SERVICE_NAME = "com.telusTest.api.protoPackage.TodoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest,
      TelusTodoObj.TodoResponse> getGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTodo",
      requestType = TelusTodoObj.GetTodoRequest.class,
      responseType = TelusTodoObj.TodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest,
      TelusTodoObj.TodoResponse> getGetTodoMethod() {
    io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest, TelusTodoObj.TodoResponse> getGetTodoMethod;
    if ((getGetTodoMethod = TodoSvcGrpc.getGetTodoMethod) == null) {
      synchronized (TodoSvcGrpc.class) {
        if ((getGetTodoMethod = TodoSvcGrpc.getGetTodoMethod) == null) {
          TodoSvcGrpc.getGetTodoMethod = getGetTodoMethod =
              io.grpc.MethodDescriptor.<TelusTodoObj.GetTodoRequest, TelusTodoObj.TodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.TodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("GetTodo"))
              .build();
        }
      }
    }
    return getGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TelusTodoObj.Empty,
      TelusTodoObj.TodoResponse> getGetAllTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTodo",
      requestType = TelusTodoObj.Empty.class,
      responseType = TelusTodoObj.TodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<TelusTodoObj.Empty,
      TelusTodoObj.TodoResponse> getGetAllTodoMethod() {
    io.grpc.MethodDescriptor<TelusTodoObj.Empty, TelusTodoObj.TodoResponse> getGetAllTodoMethod;
    if ((getGetAllTodoMethod = TodoSvcGrpc.getGetAllTodoMethod) == null) {
      synchronized (TodoSvcGrpc.class) {
        if ((getGetAllTodoMethod = TodoSvcGrpc.getGetAllTodoMethod) == null) {
          TodoSvcGrpc.getGetAllTodoMethod = getGetAllTodoMethod =
              io.grpc.MethodDescriptor.<TelusTodoObj.Empty, TelusTodoObj.TodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.TodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("GetAllTodo"))
              .build();
        }
      }
    }
    return getGetAllTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TelusTodoObj.TodoReq,
      TelusTodoObj.TodoResponse> getUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTodo",
      requestType = TelusTodoObj.TodoReq.class,
      responseType = TelusTodoObj.TodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TelusTodoObj.TodoReq,
      TelusTodoObj.TodoResponse> getUpdateTodoMethod() {
    io.grpc.MethodDescriptor<TelusTodoObj.TodoReq, TelusTodoObj.TodoResponse> getUpdateTodoMethod;
    if ((getUpdateTodoMethod = TodoSvcGrpc.getUpdateTodoMethod) == null) {
      synchronized (TodoSvcGrpc.class) {
        if ((getUpdateTodoMethod = TodoSvcGrpc.getUpdateTodoMethod) == null) {
          TodoSvcGrpc.getUpdateTodoMethod = getUpdateTodoMethod =
              io.grpc.MethodDescriptor.<TelusTodoObj.TodoReq, TelusTodoObj.TodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.TodoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.TodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("UpdateTodo"))
              .build();
        }
      }
    }
    return getUpdateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest,
      TelusTodoObj.Empty> getDeleteTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTodo",
      requestType = TelusTodoObj.GetTodoRequest.class,
      responseType = TelusTodoObj.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest,
      TelusTodoObj.Empty> getDeleteTodoMethod() {
    io.grpc.MethodDescriptor<TelusTodoObj.GetTodoRequest, TelusTodoObj.Empty> getDeleteTodoMethod;
    if ((getDeleteTodoMethod = TodoSvcGrpc.getDeleteTodoMethod) == null) {
      synchronized (TodoSvcGrpc.class) {
        if ((getDeleteTodoMethod = TodoSvcGrpc.getDeleteTodoMethod) == null) {
          TodoSvcGrpc.getDeleteTodoMethod = getDeleteTodoMethod =
              io.grpc.MethodDescriptor.<TelusTodoObj.GetTodoRequest, TelusTodoObj.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  TelusTodoObj.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("DeleteTodo"))
              .build();
        }
      }
    }
    return getDeleteTodoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceStub>() {
        @Override
        public TodoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceStub(channel, callOptions);
        }
      };
    return TodoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceBlockingStub>() {
        @Override
        public TodoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceBlockingStub(channel, callOptions);
        }
      };
    return TodoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceFutureStub>() {
        @Override
        public TodoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceFutureStub(channel, callOptions);
        }
      };
    return TodoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTodo(TelusTodoObj.GetTodoRequest request,
                         io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTodoMethod(), responseObserver);
    }

    /**
     */
    default void getAllTodo(TelusTodoObj.Empty request,
                            io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTodoMethod(), responseObserver);
    }

    /**
     */
    default void updateTodo(TelusTodoObj.TodoReq request,
                            io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTodoMethod(), responseObserver);
    }

    /**
     */
    default void deleteTodo(TelusTodoObj.GetTodoRequest request,
                            io.grpc.stub.StreamObserver<TelusTodoObj.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTodoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TodoService.
   */
  public static abstract class TodoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return TodoSvcGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TodoService.
   */
  public static final class TodoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TodoServiceStub> {
    private TodoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TodoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTodo(TelusTodoObj.GetTodoRequest request,
                        io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTodo(TelusTodoObj.Empty request,
                           io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTodo(TelusTodoObj.TodoReq request,
                           io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTodo(TelusTodoObj.GetTodoRequest request,
                           io.grpc.stub.StreamObserver<TelusTodoObj.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TodoService.
   */
  public static final class TodoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TodoServiceBlockingStub> {
    private TodoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TodoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public TelusTodoObj.TodoResponse getTodo(TelusTodoObj.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<TelusTodoObj.TodoResponse> getAllTodo(
        TelusTodoObj.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public TelusTodoObj.TodoResponse updateTodo(TelusTodoObj.TodoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public TelusTodoObj.Empty deleteTodo(TelusTodoObj.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTodoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TodoService.
   */
  public static final class TodoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TodoServiceFutureStub> {
    private TodoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TodoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TelusTodoObj.TodoResponse> getTodo(
        TelusTodoObj.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TelusTodoObj.TodoResponse> updateTodo(
        TelusTodoObj.TodoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<TelusTodoObj.Empty> deleteTodo(
        TelusTodoObj.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TODO = 0;
  private static final int METHODID_GET_ALL_TODO = 1;
  private static final int METHODID_UPDATE_TODO = 2;
  private static final int METHODID_DELETE_TODO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TODO:
          serviceImpl.getTodo((TelusTodoObj.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_TODO:
          serviceImpl.getAllTodo((TelusTodoObj.Empty) request,
              (io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TODO:
          serviceImpl.updateTodo((TelusTodoObj.TodoReq) request,
              (io.grpc.stub.StreamObserver<TelusTodoObj.TodoResponse>) responseObserver);
          break;
        case METHODID_DELETE_TODO:
          serviceImpl.deleteTodo((TelusTodoObj.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<TelusTodoObj.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              TelusTodoObj.GetTodoRequest,
              TelusTodoObj.TodoResponse>(
                service, METHODID_GET_TODO)))
        .addMethod(
          getGetAllTodoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              TelusTodoObj.Empty,
              TelusTodoObj.TodoResponse>(
                service, METHODID_GET_ALL_TODO)))
        .addMethod(
          getUpdateTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              TelusTodoObj.TodoReq,
              TelusTodoObj.TodoResponse>(
                service, METHODID_UPDATE_TODO)))
        .addMethod(
          getDeleteTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              TelusTodoObj.GetTodoRequest,
              TelusTodoObj.Empty>(
                service, METHODID_DELETE_TODO)))
        .build();
  }

  private static abstract class TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return TelusTodoObj.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TodoService");
    }
  }

  private static final class TodoServiceFileDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier {
    TodoServiceFileDescriptorSupplier() {}
  }

  private static final class TodoServiceMethodDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TodoSvcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoServiceFileDescriptorSupplier())
              .addMethod(getGetTodoMethod())
              .addMethod(getGetAllTodoMethod())
              .addMethod(getUpdateTodoMethod())
              .addMethod(getDeleteTodoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
