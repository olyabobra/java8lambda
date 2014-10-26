package edu.bobra.lambdas.chapter3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

import edu.bobra.lambdas.domain.Artist;
import edu.bobra.lambdas.domain.ArtistFixture;

public class Exercise2Test {

	@Test
	public void shouldAddUpNumberOfMembers() {
		Artist artist1 = ArtistFixture.KRAFTWERK;
		Artist artist2 = ArtistFixture.ORB;
		Artist artist3 = new Artist("Band without artists");
		Stream<Artist> artists = Arrays.asList(artist1, artist2, artist3).stream();
		assertEquals(Exercise2.countMembers(artists), 4);
	}

}
