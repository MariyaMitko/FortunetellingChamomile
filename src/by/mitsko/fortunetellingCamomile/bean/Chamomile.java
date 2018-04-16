package by.mitsko.fortunetellingCamomile.bean;

public class Chamomile {
	private int petal;

	public Chamomile(int petalCount) {
		this.petal = petalCount;
	}

	public int getPetal() {
		return petal;
	}

	public void setPetal(int petal) {
		this.petal = petal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + petal;
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
		Chamomile other = (Chamomile) obj;
		if (petal != other.petal)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Chamomile [petal=" + petal + "]";
	}
	
}
