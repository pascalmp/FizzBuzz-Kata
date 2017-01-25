package fizzbuzzkata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzKataTest {
	
	@Test
	public void fizzbuzzShouldReturnANumberItIsPassed(){
		FizzBuzz testObject = new FizzBuzz();
		assertEquals("1", testObject.fizzBuzz(1));
		
	}

}
