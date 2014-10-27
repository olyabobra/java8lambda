package edu.bobra.lambdas.chapter3;

import java.util.function.IntPredicate;

public class Exercise6 {

	public static int lowerCaseCount(String input) {
		return (int)input.chars().filter(isLowercase()).count();
	}

	private static IntPredicate isLowercase() {
		return intValue -> (intValue >= 'a' && intValue <= 'z');
	}

}
