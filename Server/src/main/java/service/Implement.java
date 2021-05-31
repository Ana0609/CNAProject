package service;

import io.grpc.stub.StreamObserver;
import proto.ChatApp;
import proto.ChatServiceGrpc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Implement extends ChatServiceGrpc.ChatServiceImplBase {
    Logger logger = Logger.getLogger("Log");
    FileHandler fh;

    {
        try {
            fh = new FileHandler("LogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void replyServer(ChatApp.FromClient request, StreamObserver<ChatApp.LoginMessage> responseObserver) {

        ChatApp.LoginMessage.Builder reply = ChatApp.LoginMessage.newBuilder();
        reply.setLogmessage(request.getName() + " has joined");
        logger.info(request.getName() + " has joined");
        System.out.println(reply.getLogmessage());
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();

    }

    @Override
    public void messageResponse(ChatApp.FromClient request, StreamObserver<ChatApp.MessageSent> responseObserver) {
//        super.messageSent(request, responseObserver);
        ChatApp.MessageSent.Builder reply = ChatApp.MessageSent.newBuilder();
        reply.setMessagesent(" message sent succesful ");
        logger.info(request.getName() + " sent a message");
        System.out.println(request.getName()+": " + request.getMessage());
        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();
    }
}
