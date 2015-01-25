package edu.bobra.lambdas.domain;

import java.util.stream.Stream;

class PerformanceStub implements Performance {
	private final Stream<Artist> artists;

	public PerformanceStub(Stream<Artist> artists) {
		this.artists = artists;
	}

	@Override
	public String getName() {
		throw new RuntimeException("Not implemented yet");
	}

	@Override
	public Stream<Artist> getMusicians() {
		return artists;
	}
}