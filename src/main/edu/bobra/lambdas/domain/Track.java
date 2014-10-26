package edu.bobra.lambdas.domain;

public class Track {
	private final String name;
	private int length;

	public Track(String name) {
		this(name, 0);
	}

	public Track(String name, int length) {
		this.name = name;
		this.length = length;
	}

	public Track withLength(int length) {
		this.length = length;
		return this;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
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
		Track other = (Track) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
