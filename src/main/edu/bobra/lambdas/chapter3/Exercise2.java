package edu.bobra.lambdas.chapter3;

import java.util.stream.Stream;

import edu.bobra.lambdas.domain.Artist;

public class Exercise2 {

	public static int countMembers(Stream<Artist> artists) {
		return artists.
				map(artist -> artist.getMembers().count()).
				reduce(0L, Long::sum).
				intValue();
	}
}
