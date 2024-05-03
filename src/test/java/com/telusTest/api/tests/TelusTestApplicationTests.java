package com.telusTest.api.tests;

import com.telusTest.api.model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest (classes =  com.telusTest.api.TelusTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
class TelusTestApplicationTests {

	@LocalServerPort
	private int port;


	private TestRestTemplate restTemplate = new TestRestTemplate();


	@Test
	void findsTodoById() {
		// act
		var todo = restTemplate.getForObject("http://localhost:" + port + "/api/todo/1", Todo.class);

		// assert
		assertThat(todo)
				.extracting(Todo::getCompletionStatus, Todo::getDescription)
				.containsExactly( "stat", "desc");
	}

	@Test
	void postTodoById() {
		Todo todoReq = new Todo(20, "testDesc", "testCStat");
		// act
		var todo = restTemplate.postForObject("http://localhost:" + port + "/api/todo", todoReq,Todo.class);

		// assert
		assertThat(todo)
				.extracting(Todo::getCompletionStatus, Todo::getDescription)
				.containsExactly( "testCStat", "testDesc");
	}



}
