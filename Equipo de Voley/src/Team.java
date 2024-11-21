
public class Team {

	// --- team data
	String name;
	public final int TOTAL_PLAYERS = 6;
	public final int TOTAL_COACHES = 2;
	
	public Player[] players = new Player[TOTAL_PLAYERS];
	public Coach[] coaches = new Coach[TOTAL_COACHES];

	// --- empty team constructor
	public Team() {}

	// --- team constructor
	public Team(String name, Player[] players, Coach[] coaches) {
		this.name = name;
		this.players = players;
		this.coaches = coaches;
	} // end team constructor

	// --- team getters
	public String getName() {return this.name;}
	public Player[] getPlayers() {return this.players;}
	public Coach[] getCoaches() {return this.coaches;}

	// --- team setters
	public void setName(String name) {this.name = name;}
	public void setPlayers(Player[] players) {this.players = players;}
	public void setCoaches(Coach[] coaches) {this.coaches = coaches;}	
	
} // end public class Team


