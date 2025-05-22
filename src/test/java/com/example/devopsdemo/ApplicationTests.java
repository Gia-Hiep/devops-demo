package com.example.devopsdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsDemoApplicationTests {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
	}
}