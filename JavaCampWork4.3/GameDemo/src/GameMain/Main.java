package GameMain;

import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game = new Game(1, "The Sims 4", "Video Game", 249.00);
		Gamer gamer = new Gamer(1, "Cansu", "T", new Date(2000,05,12), "12345678910");
		Campaign campaign = new Campaign(1, "Yaz Kampanyasý", 30);
		
		
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(gamer);
		gamerManager.update(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		gameManager.updateGame(game);
		gameManager.deleteGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game,gamer, campaign);
		
		
		
		
	}	

	}

