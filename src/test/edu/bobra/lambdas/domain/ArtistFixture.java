package edu.bobra.lambdas.domain;

import static edu.bobra.lambdas.domain.Artist.artist;

public class ArtistFixture {
	public static final Artist ALEX_PATERSON;
	public static final Artist JIMMY_CAUTY;
	public static final Artist RALF_HUETTER;
	public static final Artist FLORIAN_SCHNEIDER;
	public static final Artist ORB;
	public static final Artist KRAFTWERK;
	static {
		ALEX_PATERSON= artist("Alex Paterson");
		JIMMY_CAUTY = artist("Jimmy Cauty");
		RALF_HUETTER = artist("Ralf Huetter");
		FLORIAN_SCHNEIDER = artist("Florian Schneider");
		ORB = artist("The Orb").
				withOrigin("London").
				withMembers(ALEX_PATERSON, JIMMY_CAUTY);
		KRAFTWERK = artist("Kraftwerk").
				withOrigin("Duesseldorf").
				withMembers(RALF_HUETTER, FLORIAN_SCHNEIDER);
	}
}
