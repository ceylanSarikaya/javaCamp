package gameJavaProjectt;

public class CampaignManager implements CampaignService {

	public void add(Campaign campaign, Game game) {
	System.out.println("Kampaya eklendi" +game.getName()+"adl� oyuna"+game.getPrice()+"yeni fiyat g�ncellendi");
		
		
	}

	public void delete(Campaign campaign) {
		System.out.println("Campanya silindi");
		
	}

	public void update(Campaign campaign) {
		System.out.println("Campanya g�ncellendi");
		
	}

}
