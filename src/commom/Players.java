package commom;

import java.util.Scanner;

public class Players {
	
	//ATRIBUTES
	
	public String P1;
	public String P2;
	
	//METHODS
	
	public Players() {
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Player 1 name:");
		P1 = sc2.nextLine();
		System.out.println("Player 2 name:");
		P2 = sc2.nextLine();
	//	sc2.close();
	}
	
	public String getP1() {
		return P1;
	}
	public void setP1(String p1) {
		P1 = p1;
	}
	public String getP2() {
		return P2;
	}
	public void setP2(String p2) {
		P2 = p2;
	}
	
	
}
