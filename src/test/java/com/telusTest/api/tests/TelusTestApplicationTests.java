package com.telusTest.api.tests;

import com.telusTest.api.TelusTestApplication;
import com.telusTest.api.model.Todo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest (classes =  com.telusTest.api.TelusTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Disabled
class TelusTestApplicationTests {

	@LocalServerPort
	private int port;


	private TestRestTemplate restTemplate = new TestRestTemplate();


	@Test
	void findsTodoById() {
		// act
		var todo = restTemplate.getForObject("http://localhost:" + port + "/todo/1", Todo.class);

		// assert
		assertThat(todo)
				.extracting(Todo::getId, Todo::getCompletionStatus, Todo::getDescription)
				.containsExactly(1, "compStat", "desc");
	}

}
