package edu.bobra.lambdas.domain;

import static edu.bobra.lambdas.domain.Artist.artist;

public class ArtistFixture {
	public static final Artist ORB;
	public static final Artist KRAFTWERK;
	static {
		ORB = artist("The Orb").
				withOrigin("London").
				withMembers(artist("Alex Paterson"), artist("Jimmy Cauty"));
		KRAFTWERK = artist("Kraftwerk").
				withOrigin("Duesseldorf").
				withMembers(artist("Ralf Huetter"), artist("Florian Schneider"));
	}
}
