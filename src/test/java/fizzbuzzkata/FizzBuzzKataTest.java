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
	
	//test if testObject will return Fizz if passed a multiple of three
	@Test
	public void testObcjectShouldReturnFizzWhenPassedAMultipleOfThree(){
		assertEquals("Fizz", testObject.fizzBuzz(3));
	}
	
	//test if testObject will return Buzz if passed a multiple of five
	@Test
	public void testObjectShouldReturnBuzzWhenPassedAMultipleOfFive(){
		assertEquals("Buzz", testObject.fizzBuzz(5));
	}
	
	//Test if testObject will return FizzBuzz if passed both a multiple of 3 and 5,
	@Test
	public void testObjectShouldReturnFizzBuzzWhenPassedBothAmultipleOf3And5(){
		assertEquals("FizzBuzz", testObject.fizzBuzz(15));
	}

}
