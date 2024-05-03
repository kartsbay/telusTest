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

}
