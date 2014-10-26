package edu.bobra.lambdas.chapter3;

import java.util.function.BinaryOperator;

public class Adder implements BinaryOperator<Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		return t + u;
	}
}
