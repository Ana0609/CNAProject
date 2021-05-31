import com.sun.org.apache.xpath.internal.operations.Bool;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.ChatServiceGrpc;
import proto.ChatApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        ChatServiceGrpc.ChatServiceStub ChatStub=ChatServiceGrpc.newStub(channel);
        System.out.println("1) Add a person");
        System.out.println("0) Exit");
        System.out.println("Introduceti o optiune: ");
        int option = -1;
        while (option != 0)
        {

            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();


            switch(option)
            {
                case 1:
                    Scanner read = new Scanner(System.in);
                    System.out.print("Introduceti Numele: ");
                    String nume = read.nextLine();
                    System.out.print("Introduceti Message: ");
                    String message = read.nextLine();
        ChatStub.replyServer(
                ChatApp.FromClient.newBuilder().setName(nume).setMessage(message).build(),
                new StreamObserver<ChatApp.LoginMessage>()
                {
                    @Override
                    public void onNext(ChatApp.LoginMessage reply)
                    {
                        System.out.println(reply);
                        System.out.println("1) Add a person");
                        System.out.println("0) Exit");
                        System.out.println("Introduceti o optiune: ");
                    }

                    @Override
                    public void onError(Throwable throwable)
                    {
                        System.out.println("Error: " + throwable.getMessage());
                    }

                    @Override
                    public void onCompleted()
                    {

                    }
                }
        );
                break;
                case 0:
                    break;
                default:
                    System.out.println("Nu stiu comanda asta!");
                    break;
            }

        }
        channel.shutdown();

    }
}

