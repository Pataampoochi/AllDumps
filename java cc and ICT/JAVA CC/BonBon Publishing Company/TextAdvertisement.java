
public class TextAdvertisement  extends Advertisement
{
    private int noOfCharacters;
	
	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName,
			int noOfCharacters) {
		super(advertisementId, priority, noOfDays, clientName);
		this.noOfCharacters = noOfCharacters;
	}
    
    // Override the abstract method
    @Override
    public float calculateAdvertisementCharge(float baseCost){
        float baseAdvertisementCost=baseCost*noOfCharacters*noOfDays;
        float boosterCost=0f;
        float serviceCost=0f;
        if(priority.equals("high")){
            boosterCost+=baseAdvertisementCost*0.1f;
            serviceCost+=1000;
        }
        else if(priority.equals("medium")){
            boosterCost+=baseAdvertisementCost*0.07f;
            serviceCost+=700;
        }
        else if(priority.equals("low")){
            serviceCost+=200;
        }
        return baseAdvertisementCost+boosterCost+serviceCost;
    }
    
    
    
    
}