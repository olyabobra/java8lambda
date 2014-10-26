package edu.bobra.lambdas.chapter3;

import java.util.function.Function;

import edu.bobra.lambdas.domain.Artist;

public class ArtistFormatter implements Function<Artist, String> {

	@Override
	public String apply(Artist artist) {
		return String.format("%s (%s)", artist.getName(), artist.getOrigin());
	}

}
