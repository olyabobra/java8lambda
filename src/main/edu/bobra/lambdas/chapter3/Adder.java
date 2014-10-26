package edu.bobra.lambdas.chapter3;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Adder implements BinaryOperator<Integer> {
	
	public static int addUp(Stream<Integer> numbers){
		return numbers.reduce(0, new Adder());
	}

	@Override
	public Integer apply(Integer t, Integer u) {
		return t + u;
	}
}
