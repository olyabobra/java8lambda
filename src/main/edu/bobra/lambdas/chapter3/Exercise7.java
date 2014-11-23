package edu.bobra.lambdas.chapter3;

import static edu.bobra.lambdas.chapter3.Exercise6.lowerCaseCount;

import java.util.List;
import java.util.Optional;

public class Exercise7 {

	public static Optional<String> withMostLowerCaseLetters(List<String> input) {
		return input.stream().
				max((s, t) ->  lowerCaseCount(s) - lowerCaseCount(t));
	}
}
