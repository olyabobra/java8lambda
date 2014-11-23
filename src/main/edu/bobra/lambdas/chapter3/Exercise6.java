package edu.bobra.lambdas.chapter3;


public class Exercise6 {

	public static int lowerCaseCount(String input) {
		return (int)input.chars().filter(Character::isLowerCase).count();
	}
}
