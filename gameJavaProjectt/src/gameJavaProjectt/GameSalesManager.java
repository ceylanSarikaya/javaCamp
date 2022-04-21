package gameJavaProjectt;

public class GameSalesManager implements GameSalesService {

	public void sales(Game game, Actor actor) {
		System.out.println(game.getName()+"adlý oyun" +actor.getFirstName()+"adlý oyuncuya satýldý");
		
	}

}
