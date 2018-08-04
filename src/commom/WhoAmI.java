package commom;
import java.util.Random;

public class WhoAmI {
	
	public static void main(String[] args) {
		int ctrl = 1;
		Camps camp = new Camps();
		Players play = new Players();
		camp.imprimeCamp();
		
		while(ctrl == 1) {
			ctrl = camp.jogar(play);
		}
		
		System.out.println("Fim do jogo, encerrando...");
		if(camp.turno % 2 == 0)	System.out.println(play.getP2() + " É CAMPEÃO e o " + play.getP1() + " É CUZÃO");
		else				System.out.println(play.getP1() + " É CAMPEÃO e o " + play.getP2() + " É CUZÃO");
	}
}
