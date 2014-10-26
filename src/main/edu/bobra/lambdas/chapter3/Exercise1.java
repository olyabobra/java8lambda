package edu.bobra.lambdas.chapter3;

import java.util.stream.Stream;

public class Exercise1 {
	
	public static int addUp(Stream<Integer> numbers){
		return numbers.reduce(0, new Adder());
	}

}
