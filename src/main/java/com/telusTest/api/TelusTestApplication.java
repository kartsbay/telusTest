package com.telusTest.api;

import com.telusTest.api.model.Todo;
import com.telusTest.api.protoPackage.TodoSvcImpl;
import com.telusTest.api.service.TodoService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class TelusTestApplication{

	public static void main(String[] args) {
		SpringApplication.run(TelusTestApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	TodoService todoService;

	@Value("${grpc.port}")
	private int grpcPort;


	@Bean
	public CommandLineRunner startup() {
		return args -> {
			//jdbcTemplate.execute("DROP TABLE  IF EXISTS todo");
			jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS todo(" +
					"id INTEGER PRIMARY KEY   AUTOINCREMENT, description TEXT, completion_status TEXT)");

			jdbcTemplate.update("INSERT INTO todo(description, completion_status) VALUES (?,?)", "desc", "stat");

			List<Todo> todoLst = jdbcTemplate.query(
					"SELECT id, description, completion_status FROM todo",
					new BeanPropertyRowMapper(Todo.class));
			for (Todo tod : todoLst) {
				System.out.println(tod.getDescription() + tod.getCompletionStatus() + tod.getId());

			}

			Server server = ServerBuilder
					.forPort(grpcPort)
					.addService(new TodoSvcImpl(todoService)).build();

			server.start();
			server.awaitTermination();
		};
	}

}
