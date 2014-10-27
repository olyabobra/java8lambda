package edu.bobra.lambdas.chapter3;

import static java.util.Collections.emptyList;
import static java.util.Optional.empty;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class Exercise7Test {
	private static final String WITH_5_LOWERCASE_LETTERS = "1 Test teST";
	private static final String WITH_5_LOWERCASE_LETTERS_2 = "1 Test teST TEST";
	private static final String WITH_0_LOWERCASE_LETTERS = "2 TEST";
	private static final String WITH_7_LOWERCASE_LETTERS = "3 Test test";

	@Test
	public void shouldReturnNoneIfEmptyList() {
		assertEquals(Exercise7.withMostLowerCaseLetters(emptyList()),
				empty());
	}

	@Test
	public void shouldReturnTheStringWithMostLowercaseLetters() {
		List<String> inputStrings = Arrays.asList(WITH_5_LOWERCASE_LETTERS,
				WITH_5_LOWERCASE_LETTERS_2, WITH_0_LOWERCASE_LETTERS,
				WITH_7_LOWERCASE_LETTERS);
		assertEquals(Exercise7.withMostLowerCaseLetters(inputStrings),
				Optional.of(WITH_7_LOWERCASE_LETTERS));
	}

	@Test
	public void shouldReturnOneOfTheStringWithMostLowercaseLettersIfMultipleMatches() {
		List<String> inputStrings = Arrays.asList(WITH_5_LOWERCASE_LETTERS,
				WITH_5_LOWERCASE_LETTERS_2);
		assertEquals(Exercise7.withMostLowerCaseLetters(inputStrings),
				Optional.of(WITH_5_LOWERCASE_LETTERS));
	}

}
