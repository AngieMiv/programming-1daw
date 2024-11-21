
public class AppVoley {

	public static void main(String[] args) {

		//create Coach & Coach[]
		Coach e1 = new Coach("Alba", 21, 10);
		Coach e2 = new Coach("André", 20, 10);
		Coach[] entrenadoresE1 = {e1, e2};

		Coach e3 = new Coach("JAunjo", 32, 15);
		Coach e4 = new Coach("Miv", 27, 12);
		Coach[] entrenadoresE2 = {e3, e4};

		//at the end there's a player's constructor with dateOfBirth
		
		//create Player & Player[]
		Player p1 = new Player("Yoshi", 27, Position.SETTER, 1, 25, true);
		Player p2 = new Player("Kappa", 20, Position.LIBERO, 1, 25, true);
		Player p3 = new Player("Knuckels", 21, Position.MIDDLE_BLOCKER, 1, 25, true);
		Player p4 = new Player("Shadow", 24, Position.OPPOSITE_HITTER, 1, 25, true);
		Player p5 = new Player("Agumon", 22, Position.OUTSIDE_HITTER, 1, 25, true);
		Player p6 = new Player("Patamon", 18, Position.SERVING_SPECIALIST, 1, 25, true);
		Player[] jugadoresJ1 = {p1, p2, p3, p4, p5, p6};

		Player p7 = new Player("Kageyama", 18, Position.SETTER, 9, 25, true);
		Player p8 = new Player("Nishinoya", 17, Position.LIBERO, 4, 25, true);
		Player p9 = new Player("Hinata", 23, Position.MIDDLE_BLOCKER, 10, 25, true);
		Player p10 = new Player("Daichi", 25, Position.OPPOSITE_HITTER, 11, 25, true);
		Player p11 = new Player("Asahi", 25, Position.OUTSIDE_HITTER, 3, 25, true);
		Player p12 = new Player("Sugawara", 24, Position.SERVING_SPECIALIST, 2, 25, true);
		Player[] jugadoresJ2 = {p7, p8, p9, p10, p11, p12};

		//create Team(s)
		Team equipo1 = new Team("Equipo1", jugadoresJ1, entrenadoresE1);
		Team equipo2 = new Team("Equipo2", jugadoresJ2, entrenadoresE2);

		//--- calling and printing method to show the complete team info
		System.out.println(infoTeam(equipo1, entrenadoresE1, jugadoresJ1));
		//System.out.println(infoTeam(equipo2, entrenadoresE2, jugadoresJ2));
		

		//System.out.print(infoCoachES(entrenadoresE2)); // sysoLN included in infoCoachES
		//System.out.print(infoPlayerS(jugadoresJ1)); // sysoLN included in infoPlayerS

	} // end main AppVoley

	/* ---- printing methods ---- */

	//print infoCoach & infoCoachES
	public static String infoCoach(Coach c) {
		String infoC = "Name: " + c.getName() + ", *Age: " + c.getAge() + ", *Total Awards: " + c.getNumAwards();
		return infoC;
	}
	public static String infoCoachES(Coach[] cs) {
		String infoCs;
		System.out.println("*---------COACHES---------*");
		for (int i = 0; i < cs.length; i++) {
			infoCs = "  *" + infoCoach(cs[i]);
			System.out.println(infoCs);
		}
		return "\n";
	}

	//print infoPlayer & infoPlayerS
	public static String infoPlayer(Player p) {
		String infoP = "Name: " + p.getName() + ", *Age: " + p.getAge() + ", *Position: " + p.getPosition() + 
				", *Number: " + p.getNumber() + ", *Active?: " + p.getIsActive(); 
		return infoP;
	}
	public static String infoPlayerS(Player[] ps) {
		String infoPs;
		System.out.println("*---------PLAYERS---------*");
		for (int i = 0; i < ps.length; i++) {
			infoPs = "  *" + infoPlayer(ps[i]);
			System.out.println(infoPs);
		}
		return "\n";
	}
	
	//print complete team info

	public static String infoTeam(Team t, Coach[] cs, Player[] ps) {
		System.out.println("*---------TEAM---------*");
		String infoT = "  *Team: " + t.getName();
		System.out.println(infoT); // prints only the team name, the rest of the info is below
		System.out.print(infoCoachES(cs) + infoPlayerS(ps)); /* calls the 2 methods to print
						the info of coaches and players, since the team is composed by
						the team name, the coaches and players */
		return "\n";
	}

}

//create Player & players[]
/*Player p1 = new Player("Yoshi", "1997/01/03", Position.SETTER, 1, 25, true);
Player p2 = new Player("Kappa", "2004-04-12", Position.LIBERO, 1, 25, true);
Player p3 = new Player("Knuckels", "1995-02-13", Position.MIDDLE_BLOCKER, 1, 25, true);
Player p4 = new Player("Shadow", "1998-09-09", Position.OPPOSITE_HITTER, 1, 25, true);
Player p5 = new Player("Agumon", "1996-07-30", Position.OUTSIDE_HITTER, 1, 25, true);
Player p6 = new Player("Patamon", "2000-10-10", Position.SERVING_SPECIALIST, 1, 25, true);*/
