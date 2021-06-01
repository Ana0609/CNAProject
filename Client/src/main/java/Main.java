//import com.sun.org.apache.xpath.internal.operations.Bool;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.ChatServiceGrpc;
import proto.ChatApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        ChatServiceGrpc.ChatServiceStub ChatStub = ChatServiceGrpc.newStub(channel);
        System.out.println("Adding your name!");
        System.out.print("Introduceti Numele: ");
        Scanner read = new Scanner(System.in);
        String nume = read.nextLine();
        while (nume.length() == 0) {
            System.out.println("Numele sunt obligatorii!Introduceti un nume mai lung!");
            nume = read.nextLine();
        }
            ChatStub.replyServer(
                    ChatApp.FromClient.newBuilder().setName(nume).setMessage("login").build(),
                    new StreamObserver<ChatApp.LoginMessage>() {
                        @Override
                        public void onNext(ChatApp.LoginMessage reply) {
                            System.out.println(reply);

                        }

                        @Override
                        public void onError(Throwable throwable) {
                            System.out.println("Error: " + throwable.getMessage());
                        }

                        @Override
                        public void onCompleted() {

                        }
                    }
            );


            System.out.println(("1) Sending other message"));
            System.out.println("0) Exit");
            System.out.println("Introduceti o optiune: ");
            int option = -1;
            while (option != 0) {

                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();


                switch (option) {
                    case 1:

                        System.out.print("Introduceti Message: ");
                        String message = read.nextLine();

                        ChatStub.messageResponse(
                                ChatApp.FromClient.newBuilder().setName(nume).setMessage(message).build(),
                                new StreamObserver<ChatApp.MessageSent>() {
                                    @Override
                                    public void onNext(ChatApp.MessageSent reply) {
                                        System.out.println(reply);
                                        System.out.println("1)Send a message");
                                        System.out.println("0) Exit");
                                        System.out.println("Introduceti o optiune: ");
                                    }

                                    @Override
                                    public void onError(Throwable throwable) {
                                        System.out.println("Error: " + throwable.getMessage());
                                    }

                                    @Override
                                    public void onCompleted() {

                                    }
                                }
                        );

                        break;
                    case 0:

                        ChatStub.replyServer(
                                ChatApp.FromClient.newBuilder().setName(nume).setMessage("logout").build(),
                                new StreamObserver<ChatApp.LoginMessage>() {
                                    @Override
                                    public void onNext(ChatApp.LoginMessage reply) {
                                        System.out.println(reply);

                                    }

                                    @Override
                                    public void onError(Throwable throwable) {
                                        System.out.println("Error: " + throwable.getMessage());
                                    }

                                    @Override
                                    public void onCompleted() {

                                    }
                                }
                        );

                        break;
                    default:
                        System.out.println("Nu stiu comanda asta!");
                        break;
                }

            }
            channel.shutdown();

        }
    }

