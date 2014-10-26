package edu.bobra.lambdas.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.bobra.lambdas.domain.Artist;

public class Exercise1 {

	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, new Adder());
	}

	public static List<String> formatArtists(Stream<Artist> artists) {
		return artists.
				map(new ArtistFormatter()).
				collect(Collectors.toList());
	}

}
