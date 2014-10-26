package edu.bobra.lambdas.chapter3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class AdderTest {
	@Test
	public void shouldAddUpNumbers() {
		Stream<Integer> numbers = Arrays.asList(1,3).stream();
		assertEquals((Integer)Adder.addUp(numbers), new Integer(4));
	}
	

	@Test
	public void shouldReturn0ForEmptyLists() {
		Stream<Integer> numbers = Stream.empty();
		assertEquals((Integer)Adder.addUp(numbers),  new Integer(0));
	}

}
