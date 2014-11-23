package edu.bobra.lambdas.chapter3;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.stream.Stream;

import edu.bobra.lambdas.domain.Album;
import edu.bobra.lambdas.domain.Artist;

public class Exercise1 {

	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, Integer::sum);
	}

	public static List<String> formatArtists(Stream<Artist> artists) {
		return artists.map(artist -> formatArtist(artist)).collect(
				toList());
	}

	public static List<Album> findAlbumsWithNoMoreThanNTracks(
			Stream<Album> albums, int maxNumberOfTracks) {
		return albums.filter(
				album -> hasFewerTracksThan(album, maxNumberOfTracks)).collect(
				toList());
	}

	private static boolean hasFewerTracksThan(Album album, int maxNumberOfTracks) {
		return album.getTracks().count() <= maxNumberOfTracks;
	}

	private static String formatArtist(Artist artist) {
		return String.format("%s (%s)", artist.getName(), artist.getOrigin());
	}

}