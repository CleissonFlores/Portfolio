package commom;

import java.util.Random;
import java.util.Scanner;

public class Camps {
	
	//	ATRIBUTES
	
	public char [][] camp = new char[10][10];
	public char [][] campValue = new char[10][10];
	public int turno;
	
	
	//	METHODS
	
	public Camps() {
		Random gerador = new Random();
		turno = 1;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				camp[i][j] = '#';
				if(gerador.nextInt(2) == 0)
					campValue[i][j] = 'b';
				else
					campValue[i][j] = 'n';
			}
		}
	}
	
	public int jogar(Players play) {
		int l,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Onde deseja jogar? \n");
		System.out.println("Linha: ");
		l = sc.nextInt();
		System.out.println("Coluna: ");
		c = sc.nextInt();
		
		if(campValue[l][c] == 'n') {
			camp[l][c]= ' ';
			imprimeCamp();
			System.out.println("Não tem nada, não se fudeu. Boa sorte na próxima.\n");
			turno++;
			return 1;
		}
		else if(campValue[l][c] == 'b') {
			camp[l][c]= '*';
			imprimeCamp();
			System.out.println("\n\n");
			if(turno % 2 == 0)	System.out.println(play.getP2() + " TOMOU NO CU EHUAHEUAHEUAHEUAEA QUE OTARIO\n");
			else				System.out.println(play.getP1() + " TOMOU NO CU EHUAHEUAHEUAHEUAEA QUE OTARIO\n");
			turno++;
			return 0;
		}
		else {
			sc.close();
			turno++;
			return 1;
		}
	}

	public void imprimeCamp() {
		for(int i=0; i<11; i++) {
			if(i!=0)	System.out.print((i-1)+"|");
			else		System.out.print(" |");
			for(int j=0; j<10; j++) {
					if(i==0)
						System.out.print(j);
					else
						System.out.print(camp[i-1][j]);
			}
			System.out.print("\n");
		}
	}
	
	public void imprimeCampValue() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(campValue[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public char[][] getCamp() {
		return camp;
	}


	public void setCamp(char[][] camp) {
		this.camp = camp;
	}


	public char[][] getCampValue() {
		return campValue;
	}


	public void setCampValue(char[][] campValue) {
		this.campValue = campValue;
	}
}
