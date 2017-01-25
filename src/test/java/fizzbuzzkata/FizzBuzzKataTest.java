package fizzbuzzkata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzKataTest {
	
	FizzBuzz testObject;
	
	@Before
	public void setUp(){
	  
		testObject = new FizzBuzz();
	}
	
	//Test if testObjectFizzBuzz returns the same number it is passed
	
	@Test
	public void testObjectFizzBuzzShouldReturnANumberItIsPassed(){
		
		assertEquals("1", testObject.fizzBuzz(1));
		
	}
	//Test to verify if testObjectFizzBuzz returns the same number it is passed every time,
	@Test
	public void testObjectFizzBuzzShouldReturn2whenPassedTwo(){
		
		assertEquals("2", testObject.fizzBuzz(2));
	}

}
