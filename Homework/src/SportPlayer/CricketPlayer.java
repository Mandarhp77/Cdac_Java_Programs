package SportPlayer;

public class CricketPlayer extends Player{
	private int runs;
	private int wickets;
	
	public CricketPlayer() {
		super();
	}

	public CricketPlayer(int runs, int wickets, int id, String name, int matches) {
		super(id, name, matches);
		this.runs = runs;
		this.wickets = wickets;
	}
	
	@Override
	public String toString() {
		return "runs=" + runs + ", wickets=" + wickets;
	}
	
}
