package edu.bobra.lambdas.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise6Test {

	@Test
	public void shouldReturn0ForEmptyString() {
		assertEquals(Exercise6.lowerCaseCount(""), 0);
	}
	
	@Test
	public void shouldCountLowerCaseChars() {
		assertEquals(Exercise6.lowerCaseCount("Test test TEST"), 7);
	}

}
