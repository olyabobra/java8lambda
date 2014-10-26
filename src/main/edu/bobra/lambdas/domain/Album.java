package edu.bobra.lambdas.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Album {
	private final String name;
	private List<Track> tracks = new ArrayList<Track>();
	public Album(String name) {
		super();
		this.name = name;
	}
	public static Album album(String name){
		return new Album(name);
	}

	public void addTrack(Track track){
		tracks.add(track);
	}
	
	public Album withTracks(Track... tracksArray){
		tracks.addAll(Arrays.asList(tracksArray));
		return this;
	}

	public String getName() {
		return name;
	}
	
	public Stream<Track> getTracks() {
		return tracks.stream();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
