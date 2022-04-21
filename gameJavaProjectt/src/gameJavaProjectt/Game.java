package gameJavaProjectt;

public class Game {
	private int id;
	private String name;
	private int salesId;
	private int campaignId;
	private int price;

	public Game(int id, String name, int salesId, int campaignId, int price) {
		super();
		this.id = id;
		this.name = name;
		this.salesId = salesId;
		this.campaignId = campaignId;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
