package com.product;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductAppApplicationTests {

	@Test
	public void testMain() {
		String args[] = new String[2];
		
		assertThrows(NullPointerException.class, ()-> ProductAppApplication.main(args));
	}

}
