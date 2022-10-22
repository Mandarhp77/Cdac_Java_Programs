package SportPlayer;

public class Player {
	private int playerId;
	private String name;
	private int numberOfMatches;

	public Player() {
		
	}
	public Player(int id, String name, int matches) {
		super();
		this.playerId = id;
		this.name = name;
		this.numberOfMatches = matches;
		}
	

	@Override
	public String toString() {
		return "playerId=" + playerId + ", name=" + name + ", numberOfMatches=" + numberOfMatches;
	}

}
