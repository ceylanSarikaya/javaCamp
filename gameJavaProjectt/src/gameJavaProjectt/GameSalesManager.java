package gameJavaProjectt;

public class GameSalesManager implements GameSalesService {

	public void sales(Game game, Actor actor) {
		System.out.println(game.getName()+"adl� oyun" +actor.getFirstName()+"adl� oyuncuya sat�ld�");
		
	}

}
