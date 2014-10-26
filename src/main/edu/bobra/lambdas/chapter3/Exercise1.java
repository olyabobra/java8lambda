package edu.bobra.lambdas.chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.bobra.lambdas.domain.Album;
import edu.bobra.lambdas.domain.Artist;

public class Exercise1 {

	public static int addUp(Stream<Integer> numbers) {
		return numbers.reduce(0, (accumulator, number) -> accumulator + number);
	}

	public static List<String> formatArtists(Stream<Artist> artists) {
		return artists.
				map(artist -> formatArtist(artist)).
				collect(Collectors.toList());
	}
	
	public static List<Album> findAlbumsWithNoMoreThanNTracks(Stream<Album> albums, int maxNumberOfTracks) {
		return albums.filter(album -> hasFewerTracksThan(album, maxNumberOfTracks)).collect(Collectors.toList());
	}

	private static boolean hasFewerTracksThan(Album album, int maxNumberOfTracks) {
		return album.getTracks().count() <= maxNumberOfTracks;
	}

	private static String formatArtist(Artist artist) {
		return String.format("%s (%s)", artist.getName(), artist.getOrigin());
	}


}
