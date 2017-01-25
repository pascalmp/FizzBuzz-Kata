package fizzbuzzkata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzKataTest {
	
	//Test if testObjectFizzBuzz returns the same number it is passed
	
	@Test
	public void testObjectFizzBuzzShouldReturnANumberItIsPassed(){
		FizzBuzz testObject = new FizzBuzz();
		assertEquals("1", testObject.fizzBuzz(1));
		
	}
	//Test to verify if testObjectFizzBuzz returns the same number it is passed every time,
	@Test
	public void testObjectFizzBuzzShouldReturn2whenPassedTwo(){
		FizzBuzz testObject = new FizzBuzz();
		assertEquals("2", testObject.fizzBuzz(2));
	}

}
