package edu.bobra.lambdas.domain;

import static edu.bobra.lambdas.domain.ArtistFixture.ALEX_PATERSON;
import static edu.bobra.lambdas.domain.ArtistFixture.FLORIAN_SCHNEIDER;
import static edu.bobra.lambdas.domain.ArtistFixture.JIMMY_CAUTY;
import static edu.bobra.lambdas.domain.ArtistFixture.KRAFTWERK;
import static edu.bobra.lambdas.domain.ArtistFixture.ORB;
import static edu.bobra.lambdas.domain.ArtistFixture.RALF_HUETTER;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class PerformanceTest {
	@Test
	public void shouldReturnEmptyStreamIfNoArtists() {
		Performance performance = new PerformanceStub(Stream.of());
		assertEquals(0, performance.getAllMusicians().count());
	}

	@Test
	public void shouldReturnAListOfBandsWithMusicians() {
		Performance performance = new PerformanceStub(Stream.of(ORB, KRAFTWERK));
		assertEquals(Arrays.asList(ORB, ALEX_PATERSON, JIMMY_CAUTY, KRAFTWERK,
				RALF_HUETTER, FLORIAN_SCHNEIDER), performance.getAllMusicians()
				.collect(Collectors.toList()));

	}

}
