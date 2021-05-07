package JavaKamp.GameProject.Entities;

public class Campaign {

    private int campaignId;
    private String campainName;

    public Campaign() {
    }

    public Campaign(int campaignId, String campainName) {
        this.campaignId = campaignId;
        this.campainName = campainName;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampainName() {
        return campainName;
    }

    public void setCampainName(String campainName) {
        this.campainName = campainName;
    }
}
