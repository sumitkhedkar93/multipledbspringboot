package com.example.multipledbspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class MultipleDbSpringbootApplicationTests {

	@Test
	void contextLoads() {
		Assert.notNull("Test", "Success");
	}

}