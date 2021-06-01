package service;

import io.grpc.stub.StreamObserver;
import proto.ChatApp;
import proto.ChatServiceGrpc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.HashMap;


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

        if (request.getMessage().equalsIgnoreCase("login") ) {
            reply.setLogmessage(request.getName() + " has joined");
            logger.info(request.getName() + " has joined");
            System.out.println(reply.getLogmessage());
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
        else {
            reply.setLogmessage(request.getName() + " has left");
            logger.info(request.getName() + " has LEFT");
            System.out.println(reply.getLogmessage());
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();

        }

    }

    @Override
    public void messageResponse(ChatApp.FromClient request, StreamObserver<ChatApp.MessageSent> responseObserver) {

        HashMap<String, String> messages = new HashMap<String, String>();
        ChatApp.MessageSent.Builder reply = ChatApp.MessageSent.newBuilder();
        reply.setMessagesent(request.getMessage());
        logger.info(request.getName() + " sent a message");

        messages.put(request.getName(),request.getMessage());

        System.out.println(request.getName()+": " + request.getMessage());

        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();

        //System.out.println(messages);
    }

}
