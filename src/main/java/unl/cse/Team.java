package unl.cse;

/**
 * This class models a Major League Baseball team and their number of
 * wins/losses.
 * 
 * @author cbourke
 *
 */
public class Team {

	public final String name;
	public final Integer wins;
	public final Integer loss;

	public Team(String name, Integer wins, Integer loss) {
		this.name = name;
		this.wins = wins;
		this.loss = loss;
	}

	public String getName() {
		return this.name;
	}

	public Integer getWins() {
		return this.wins;
	}

	public Integer getLoss() {
		return this.loss;
	}

	/**
	 * Returns the win percentage (on the scale [0, 1]) of
	 * this team.
	 * @return
	 */
	public Double getWinPercentage() {
		return this.wins / (double) (this.wins + this.loss);
	}

	public String toString() {
		return this.name + " (" + this.wins + ", " + this.loss + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loss == null) ? 0 : loss.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((wins == null) ? 0 : wins.hashCode());
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
		Team other = (Team) obj;
		if (loss == null) {
			if (other.loss != null)
				return false;
		} else if (!loss.equals(other.loss))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wins == null) {
			if (other.wins != null)
				return false;
		} else if (!wins.equals(other.wins))
			return false;
		return true;
	}
	
	
}
