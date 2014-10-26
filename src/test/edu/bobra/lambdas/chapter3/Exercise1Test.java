package edu.bobra.lambdas.chapter3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

import edu.bobra.lambdas.domain.Album;
import edu.bobra.lambdas.domain.Artist;
import edu.bobra.lambdas.domain.Track;
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

	@Test
	public void shouldFilterAlbumsWithFewerThanNTracks() {
		Album albumWith0Tracks = Album.album("Album1");
		Album albumWith10Tracks = addTracks(Album.album("Album2"), 10);
		Album albumWith3Tracks = addTracks(Album.album("Album3"), 3);
		Stream<Album> albums = Arrays.asList(albumWith0Tracks,
				albumWith10Tracks, albumWith3Tracks).stream();
		
		assertEquals(Exercise1.findAlbumsWithNoMoreThanNTracks(albums, 3),
				Arrays.asList(albumWith0Tracks, albumWith3Tracks));
	}

	private static Album addTracks(Album album, int numberOfTracksToAdd) {
		for (int i = 0; i < numberOfTracksToAdd; i++) {
			album.addTrack(new Track(String.format("Track%d", i)));
		}
		return album;
	}

}