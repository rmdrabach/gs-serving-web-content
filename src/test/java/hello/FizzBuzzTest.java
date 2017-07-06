package hello;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.bus.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void NegativeIsInvalid() {
		// given
		int number = -1;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(FizzBuzz.MESSSAGE_INVALID_NUMBER, answer);
	}
	
	@Test
	public void ZeroIsInvalid() {
		// given
		int number = 0;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(FizzBuzz.MESSSAGE_INVALID_NUMBER, answer);
	}
	
	@Test
	public void FourIsFour() {
		// given
		int number = 4;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(String.valueOf(number), answer);
	}
	
	@Test
	public void FiveIsBuzz() {
		// given
		int number = 5;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(FizzBuzz.BUZZ, answer);
	}
	
	@Test
	public void SixIsFizz() {
		// given
		int number = 6;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(FizzBuzz.FIZZ, answer);
	}

	
	@Test
	public void SevenIsSeven() {
		// given
		int number = 7;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(String.valueOf(number), answer);
	}
	
	@Test
	public void FifteenIsFizzBuzz() {
		// given
		int number = 15;
		
		// when
		String answer = FizzBuzz.answerTo(number);
		
		// then
		assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, answer);
	}
}
