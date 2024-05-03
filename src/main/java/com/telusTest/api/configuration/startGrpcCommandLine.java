package com.telusTest.api.configuration;

import com.telusTest.api.protoPackage.TodoSvcImpl;
import com.telusTest.api.service.TodoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
@Order(2)
public class startGrpcCommandLine implements CommandLineRunner {
    @Autowired
    TodoService todoService;

    @Value("${grpc.port}")
    private int grpcPort;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting grpc :" + grpcPort);
        Server server = ServerBuilder
					.forPort(grpcPort)
					.addService(new TodoSvcImpl(todoService)).build();

			server.start();
			server.awaitTermination();
    }
}
