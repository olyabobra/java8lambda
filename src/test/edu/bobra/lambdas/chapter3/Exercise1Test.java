package edu.bobra.lambdas.chapter3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

import edu.bobra.lambdas.domain.Artist;
import static edu.bobra.lambdas.domain.ArtistFixture.ORB;
import static edu.bobra.lambdas.domain.ArtistFixture.KRAFTWERK;

public class Exercise1Test {
	@Test
	public void shouldAddUpNumbers() {
		Stream<Integer> numbers = Arrays.asList(1, 3).stream();
		assertEquals((Integer) Exercise1.addUp(numbers), new Integer(4));
	}

	@Test
	public void shouldReturn0ForAddingUpEmptyLists() {
		Stream<Integer> numbers = Stream.empty();
		assertEquals((Integer) Exercise1.addUp(numbers), new Integer(0));
	}

	@Test
	public void shouldFormatArtists() {
		Stream<Artist> artists = Arrays.asList(ORB, KRAFTWERK).stream();
		assertEquals(Exercise1.formatArtists(artists),
				Arrays.asList("The Orb (London)", "Kraftwerk (Duesseldorf)"));
	}

	@Test
	public void shouldFormatAnEmptyListOfArtists() {
		Stream<Artist> artists = Stream.empty();
		assertEquals(Exercise1.formatArtists(artists), Arrays.asList());
	}

}