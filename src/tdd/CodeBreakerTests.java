package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeBreakerTests {
	CodeBreaker codeBreaker;

	@Test
	void testRightAnswer() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(1234);
		assertEquals(result,"XXXX" );
	}
	
	@Test
	void testAllNumbersMatch() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(3142);
		assertEquals(result,"----" );
	}
	
	@Test
	void testSomeNumbersMatchOnPosition() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(1243);
		assertEquals(result,"XX--" );
	}
	
	@Test
	void testJustOneMatchSamePosition() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(9285);
		assertEquals(result,"X" );
	}
	
	@Test
	void testJustOneMatchNotSamePosition() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(2985);
		assertEquals(result,"-" );
	}
	
	@Test
	void testNeitherNumbersMatch() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(5678);
		assertEquals(result,"");
	}
	
	@Test
	void testSomeNumbersNotMatch() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(1952);
		assertEquals(result,"X-");
	}
	
	@Test
	void isTheSameLength() {
		codeBreaker = new CodeBreaker();
		Boolean result = codeBreaker.validate(1952);
		assertTrue(result);
	}
	
	@Test
	void isNotTheSameLength() {
		codeBreaker = new CodeBreaker();
		Boolean result = codeBreaker.validate(19525);
		assertFalse(result);
	}
	
	@Test
	void failedComparation() {
		codeBreaker = new CodeBreaker();
		String result = codeBreaker.compare(19527);
		assertEquals(result,"Unexpected size");
	}
	
}
