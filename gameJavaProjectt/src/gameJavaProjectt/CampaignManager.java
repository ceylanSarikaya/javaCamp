package gameJavaProjectt;

public class CampaignManager implements CampaignService {

	public void add(Campaign campaign, Game game) {
	System.out.println("Kampaya eklendi" +game.getName()+"adlý oyuna"+game.getPrice()+"yeni fiyat güncellendi");
		
		
	}

	public void delete(Campaign campaign) {
		System.out.println("Campanya silindi");
		
	}

	public void update(Campaign campaign) {
		System.out.println("Campanya güncellendi");
		
	}

}
