package com.telusTest.api.tests;

import com.telusTest.api.model.Todo;
import com.telusTest.api.service.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//@Disabled
class TelusTestApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TodoService service;

	//@Autowired
	//private MockMvc mockMvc;


	private TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void shouldReturnMessage() throws Exception {
		when(service.getTodo(1)).thenReturn(new Todo());


	}


	@Test
	void findsTodoById() {
		// act
		/*var todo = restTemplate.getForObject("http://localhost:" + port + "/todo/1", Todo.class);

		// assert
		assertThat(todo)
				.extracting(Todo::getId, Todo::getCompletionStatus, Todo::getDescription)
				.containsExactly(1, "compStat", "desc");*/
	}

}
