package JavaKamp.GameProject.Concrete;

import JavaKamp.GameProject.Abstracts.CampaignService;
import JavaKamp.GameProject.Entities.Campaign;

public class CampaignManager implements CampaignService {


    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampainName() + " kampanyası tanımlanmıştır.");
    }

    @Override
    public void delete(Campaign campaign) {

        System.out.println(campaign.getCampainName() + " kampanyası kaldırılmıştır");
    }
}
