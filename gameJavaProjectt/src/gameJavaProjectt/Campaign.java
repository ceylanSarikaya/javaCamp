package gameJavaProjectt;

public class Campaign {
	private int id;
	private int gameId;
	private String name;
	private double discountRate;

	public Campaign(int id, int gameId, String name, double discountRate) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.name = name;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
