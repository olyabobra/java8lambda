package edu.bobra.lambdas.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class ArtistsTest {
	private Artists artists;
	private static List<Artist> ARTISTS_LIST = Arrays.asList(
			ArtistFixture.KRAFTWERK, ArtistFixture.ORB);

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfArtistsNull() {
		artists = new Artists(null);
	}

	@Test
	public void getArtistShouldReturnNoneIfNoArtists() {
		artists = new Artists(Collections.emptyList());
		Optional<Artist> artist = artists.getArtist(0);
		assertFalse(artist.isPresent());
	}

	@Test
	public void getArtistNameShouldReturnNoneIfNoArtists() {
		artists = new Artists(Collections.emptyList());
		Optional<String> artistName = artists.getArtistName(0);
		assertFalse(artistName.isPresent());
	}

	@Test
	public void getArtistShouldReturnNoneIfIndexLessThan0() {
		artists = new Artists(ARTISTS_LIST);
		Optional<Artist> artist = artists.getArtist(-1);
		assertFalse(artist.isPresent());
	}

	@Test
	public void getArtistNameShouldReturnNoneIfIndexLessThan0() {
		artists = new Artists(ARTISTS_LIST);
		Optional<String> artistName = artists.getArtistName(-1);
		assertFalse(artistName.isPresent());
	}

	@Test
	public void getArtistShouldReturnNoneIfIndexOutOfBounds() {
		artists = new Artists(ARTISTS_LIST);
		Optional<Artist> artist = artists.getArtist(ARTISTS_LIST.size());
		assertFalse(artist.isPresent());
	}

	@Test
	public void getArtistNameShouldReturnNoneIfIndexOutOfBounds() {
		artists = new Artists(ARTISTS_LIST);
		Optional<String> artistName = artists
				.getArtistName(ARTISTS_LIST.size());
		assertFalse(artistName.isPresent());
	}

	@Test
	public void getArtistShouldReturnTheArtist() {
		artists = new Artists(ARTISTS_LIST);
		Optional<Artist> artist = artists.getArtist(0);
		assertEquals(ARTISTS_LIST.get(0), artist.get());
	}

	@Test
	public void getArtistNameShouldReturnTheArtistsName() {
		artists = new Artists(ARTISTS_LIST);
		Optional<String> artistName = artists.getArtistName(0);
		assertEquals(ARTISTS_LIST.get(0).getName(), artistName.get());
	}
}
