package com.techprimers.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzTest {
	
	
	@Test
	public void testNumber() {
		
		String fizzbuzz = new FizzBuzz().play(1);
		
		Assertions.assertEquals(fizzbuzz, "1");
	}

}
