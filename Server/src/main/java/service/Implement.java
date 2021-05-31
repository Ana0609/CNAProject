package service;

import io.grpc.stub.StreamObserver;
import proto.ChatApp;
import proto.ChatServiceGrpc;

public class Implement extends ChatServiceGrpc.ChatServiceImplBase {
    @Override
    public void replyServer(ChatApp.FromClient request, StreamObserver<ChatApp.LoginMessage> responseObserver) {

        ChatApp.LoginMessage.Builder reply = ChatApp.LoginMessage.newBuilder();
        reply.setLogmessage(request.getName() + " has joined");
        System.out.println(reply.getLogmessage());
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();

    }

    @Override
    public void messageResponse(ChatApp.FromClient request, StreamObserver<ChatApp.MessageSent> responseObserver) {
//        super.messageSent(request, responseObserver);
        ChatApp.MessageSent.Builder reply = ChatApp.MessageSent.newBuilder();
        reply.setMessagesent(" message sent succesful ");
        System.out.println(request.getName()+" sent a message");
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();
    }
}
