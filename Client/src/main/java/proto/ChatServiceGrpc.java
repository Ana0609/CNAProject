package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ChatApp.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "ChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.LoginMessage> getReplyServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "replyServer",
      requestType = proto.ChatApp.FromClient.class,
      responseType = proto.ChatApp.LoginMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.LoginMessage> getReplyServerMethod() {
    io.grpc.MethodDescriptor<proto.ChatApp.FromClient, proto.ChatApp.LoginMessage> getReplyServerMethod;
    if ((getReplyServerMethod = ChatServiceGrpc.getReplyServerMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getReplyServerMethod = ChatServiceGrpc.getReplyServerMethod) == null) {
          ChatServiceGrpc.getReplyServerMethod = getReplyServerMethod = 
              io.grpc.MethodDescriptor.<proto.ChatApp.FromClient, proto.ChatApp.LoginMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "replyServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.FromClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.LoginMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("replyServer"))
                  .build();
          }
        }
     }
     return getReplyServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.MessageSent> getMessageResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "messageResponse",
      requestType = proto.ChatApp.FromClient.class,
      responseType = proto.ChatApp.MessageSent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.MessageSent> getMessageResponseMethod() {
    io.grpc.MethodDescriptor<proto.ChatApp.FromClient, proto.ChatApp.MessageSent> getMessageResponseMethod;
    if ((getMessageResponseMethod = ChatServiceGrpc.getMessageResponseMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getMessageResponseMethod = ChatServiceGrpc.getMessageResponseMethod) == null) {
          ChatServiceGrpc.getMessageResponseMethod = getMessageResponseMethod = 
              io.grpc.MethodDescriptor.<proto.ChatApp.FromClient, proto.ChatApp.MessageSent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "messageResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.FromClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.MessageSent.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("messageResponse"))
                  .build();
          }
        }
     }
     return getMessageResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.FromServer> getChatRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "chatRequest",
      requestType = proto.ChatApp.FromClient.class,
      responseType = proto.ChatApp.FromServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ChatApp.FromClient,
      proto.ChatApp.FromServer> getChatRequestMethod() {
    io.grpc.MethodDescriptor<proto.ChatApp.FromClient, proto.ChatApp.FromServer> getChatRequestMethod;
    if ((getChatRequestMethod = ChatServiceGrpc.getChatRequestMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getChatRequestMethod = ChatServiceGrpc.getChatRequestMethod) == null) {
          ChatServiceGrpc.getChatRequestMethod = getChatRequestMethod = 
              io.grpc.MethodDescriptor.<proto.ChatApp.FromClient, proto.ChatApp.FromServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChatService", "chatRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.FromClient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ChatApp.FromServer.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("chatRequest"))
                  .build();
          }
        }
     }
     return getChatRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void replyServer(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.LoginMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getReplyServerMethod(), responseObserver);
    }

    /**
     */
    public void messageResponse(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.MessageSent> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageResponseMethod(), responseObserver);
    }

    /**
     */
    public void chatRequest(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.FromServer> responseObserver) {
      asyncUnimplementedUnaryCall(getChatRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReplyServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ChatApp.FromClient,
                proto.ChatApp.LoginMessage>(
                  this, METHODID_REPLY_SERVER)))
          .addMethod(
            getMessageResponseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ChatApp.FromClient,
                proto.ChatApp.MessageSent>(
                  this, METHODID_MESSAGE_RESPONSE)))
          .addMethod(
            getChatRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ChatApp.FromClient,
                proto.ChatApp.FromServer>(
                  this, METHODID_CHAT_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub> {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    /**
     */
    public void replyServer(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.LoginMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReplyServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageResponse(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.MessageSent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void chatRequest(proto.ChatApp.FromClient request,
        io.grpc.stub.StreamObserver<proto.ChatApp.FromServer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChatRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.ChatApp.LoginMessage replyServer(proto.ChatApp.FromClient request) {
      return blockingUnaryCall(
          getChannel(), getReplyServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ChatApp.MessageSent messageResponse(proto.ChatApp.FromClient request) {
      return blockingUnaryCall(
          getChannel(), getMessageResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ChatApp.FromServer chatRequest(proto.ChatApp.FromClient request) {
      return blockingUnaryCall(
          getChannel(), getChatRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ChatApp.LoginMessage> replyServer(
        proto.ChatApp.FromClient request) {
      return futureUnaryCall(
          getChannel().newCall(getReplyServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ChatApp.MessageSent> messageResponse(
        proto.ChatApp.FromClient request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ChatApp.FromServer> chatRequest(
        proto.ChatApp.FromClient request) {
      return futureUnaryCall(
          getChannel().newCall(getChatRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPLY_SERVER = 0;
  private static final int METHODID_MESSAGE_RESPONSE = 1;
  private static final int METHODID_CHAT_REQUEST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPLY_SERVER:
          serviceImpl.replyServer((proto.ChatApp.FromClient) request,
              (io.grpc.stub.StreamObserver<proto.ChatApp.LoginMessage>) responseObserver);
          break;
        case METHODID_MESSAGE_RESPONSE:
          serviceImpl.messageResponse((proto.ChatApp.FromClient) request,
              (io.grpc.stub.StreamObserver<proto.ChatApp.MessageSent>) responseObserver);
          break;
        case METHODID_CHAT_REQUEST:
          serviceImpl.chatRequest((proto.ChatApp.FromClient) request,
              (io.grpc.stub.StreamObserver<proto.ChatApp.FromServer>) responseObserver);
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

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ChatApp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getReplyServerMethod())
              .addMethod(getMessageResponseMethod())
              .addMethod(getChatRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
