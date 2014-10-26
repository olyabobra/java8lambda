package edu.bobra.lambdas.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Artist {
	private final String name;
	private String origin;
	private Set<Artist> members = new HashSet<Artist>();

	public Artist(String name) {
		this.name = name;
	}

	public Artist withOrigin(String origin) {
		this.origin = origin;
		return this;
	}

	public Artist withMember(Artist member) {
		addMember(member);
		return this;
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Stream<Artist> getMembers() {
		return members.stream();
	}

	public void addMember(Artist member) {
		members.add(member);
	}

	public void setMembers(Set<Artist> members) {
		this.members = members;
	}

	public static Artist artist(String name) {
		return new Artist(name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
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
		Artist other = (Artist) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
