package SportPlayer;

import java.util.Arrays;

public class Team {
	private int teamId;
	private String tname;
	private int no_of_players;
	private CricketPlayer Players=null;
	

	public Team() {
	    Players=new CricketPlayer();
	}
	
	public Team(int teamId, String tname, int no_of_players) {
		this.teamId = teamId;
		this.tname = tname;
		this.no_of_players = no_of_players;
	}
		
	
	public Team(int teamId, String tname, int no_of_players, CricketPlayer players) {
		this.teamId = teamId;
		this.tname = tname;
		this.no_of_players = no_of_players;
		Players = players;
	}
	@Override
	public String toString() {
		return "teamId=" + teamId + ", name=" + tname + ", no_of_players=" + 
	    no_of_players+"Players"+Players.toString();
	}
	

}
