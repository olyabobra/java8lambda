package edu.bobra.lambdas.domain;

import java.util.stream.Stream;

public interface Performance {
	public String getName();

	public Stream<Artist> getMusicians();

	public default Stream<Artist> getAllMusicians() {
		return getMusicians().flatMap(
				a -> Stream.concat(Stream.of(a), a.getMembers()));
	}
}
