package com.vinsguru.grpcflix.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: user-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserSearchRequest,
      com.vinsguru.grpcflix.user.UserResponse> getGetUserGenreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserGenre",
      requestType = com.vinsguru.grpcflix.user.UserSearchRequest.class,
      responseType = com.vinsguru.grpcflix.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserSearchRequest,
      com.vinsguru.grpcflix.user.UserResponse> getGetUserGenreMethod() {
    io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserSearchRequest, com.vinsguru.grpcflix.user.UserResponse> getGetUserGenreMethod;
    if ((getGetUserGenreMethod = UserServiceGrpc.getGetUserGenreMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserGenreMethod = UserServiceGrpc.getGetUserGenreMethod) == null) {
          UserServiceGrpc.getGetUserGenreMethod = getGetUserGenreMethod =
              io.grpc.MethodDescriptor.<com.vinsguru.grpcflix.user.UserSearchRequest, com.vinsguru.grpcflix.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserGenre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.grpcflix.user.UserSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.grpcflix.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserGenre"))
              .build();
        }
      }
    }
    return getGetUserGenreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserGenreUpdateRequest,
      com.vinsguru.grpcflix.user.UserResponse> getUpdateUserGenreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUserGenre",
      requestType = com.vinsguru.grpcflix.user.UserGenreUpdateRequest.class,
      responseType = com.vinsguru.grpcflix.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserGenreUpdateRequest,
      com.vinsguru.grpcflix.user.UserResponse> getUpdateUserGenreMethod() {
    io.grpc.MethodDescriptor<com.vinsguru.grpcflix.user.UserGenreUpdateRequest, com.vinsguru.grpcflix.user.UserResponse> getUpdateUserGenreMethod;
    if ((getUpdateUserGenreMethod = UserServiceGrpc.getUpdateUserGenreMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserGenreMethod = UserServiceGrpc.getUpdateUserGenreMethod) == null) {
          UserServiceGrpc.getUpdateUserGenreMethod = getUpdateUserGenreMethod =
              io.grpc.MethodDescriptor.<com.vinsguru.grpcflix.user.UserGenreUpdateRequest, com.vinsguru.grpcflix.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUserGenre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.grpcflix.user.UserGenreUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vinsguru.grpcflix.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateUserGenre"))
              .build();
        }
      }
    }
    return getUpdateUserGenreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUserGenre(com.vinsguru.grpcflix.user.UserSearchRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserGenreMethod(), responseObserver);
    }

    /**
     */
    default void updateUserGenre(com.vinsguru.grpcflix.user.UserGenreUpdateRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserGenreMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserGenre(com.vinsguru.grpcflix.user.UserSearchRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserGenreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserGenre(com.vinsguru.grpcflix.user.UserGenreUpdateRequest request,
        io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserGenreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vinsguru.grpcflix.user.UserResponse getUserGenre(com.vinsguru.grpcflix.user.UserSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserGenreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.vinsguru.grpcflix.user.UserResponse updateUserGenre(com.vinsguru.grpcflix.user.UserGenreUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserGenreMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vinsguru.grpcflix.user.UserResponse> getUserGenre(
        com.vinsguru.grpcflix.user.UserSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserGenreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vinsguru.grpcflix.user.UserResponse> updateUserGenre(
        com.vinsguru.grpcflix.user.UserGenreUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserGenreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_GENRE = 0;
  private static final int METHODID_UPDATE_USER_GENRE = 1;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_GENRE:
          serviceImpl.getUserGenre((com.vinsguru.grpcflix.user.UserSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_GENRE:
          serviceImpl.updateUserGenre((com.vinsguru.grpcflix.user.UserGenreUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.vinsguru.grpcflix.user.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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
          getGetUserGenreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.vinsguru.grpcflix.user.UserSearchRequest,
              com.vinsguru.grpcflix.user.UserResponse>(
                service, METHODID_GET_USER_GENRE)))
        .addMethod(
          getUpdateUserGenreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.vinsguru.grpcflix.user.UserGenreUpdateRequest,
              com.vinsguru.grpcflix.user.UserResponse>(
                service, METHODID_UPDATE_USER_GENRE)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vinsguru.grpcflix.user.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserGenreMethod())
              .addMethod(getUpdateUserGenreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
