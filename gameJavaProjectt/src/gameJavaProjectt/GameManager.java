package gameJavaProjectt;

public class GameManager implements GameService{

	public void add(Game game) {
		System.out.println("Oyun eklendi" +game.getName());
		
	}

	public void delete(Game game) {
		System.out.println("Oyun silindi" +game.getName());
		
	}

	

	

}
