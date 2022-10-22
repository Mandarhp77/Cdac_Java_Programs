package SportPlayer;

public class MainC {

	public static void main(String[] args) {
		
		Player p1 = new Player(7,"Dhoni",120);
		System.out.println(p1.toString());
		
		Player p2 = new CricketPlayer(88,1,99,"Virat",100);
		System.out.println(p2.toString());
		
		CricketPlayer players = new CricketPlayer(50, 2, 89,"Rohit", 75);
		
		Team p3 = new Team(101, "India", 11, players);
		System.out.println(p3.toString());
		
		Team p4 = new Team(506,"SA",11);
		System.out.println(p4.toString());
	}
}
