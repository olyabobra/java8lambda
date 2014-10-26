package edu.bobra.lambdas.domain;

public class ArtistFixture {
	public static final Artist ORB;
	public static final Artist KRAFTWERK;
	static {
		ORB = Artist.artist("The Orb").withOrigin("London");
		KRAFTWERK = Artist.artist("Kraftwerk").withOrigin("Duesseldorf");
	}
}
