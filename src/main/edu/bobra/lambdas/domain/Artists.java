package edu.bobra.lambdas.domain;

import java.util.List;
import java.util.Optional;

public class Artists {
	private List<Artist> artists;

	public Artists(List<Artist> artists) {
		if (artists == null) {
			throw new IllegalArgumentException("Artists can't be null");
		}
		this.artists = artists;
	}

	public Optional<Artist> getArtist(int index) {
		if (index < 0 || index >= artists.size()) {
			return Optional.empty();
		}
		return Optional.of(artists.get(index));
	}

	public Optional<String> getArtistName(int index) {
		Optional<Artist> artist = getArtist(index);
		return artist.map(a -> a.getName());
	}

}
