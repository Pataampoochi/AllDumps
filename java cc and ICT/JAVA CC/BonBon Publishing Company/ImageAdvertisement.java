
public class ImageAdvertisement  extends Advertisement
{
    private int inches;
	
	public ImageAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int inches) {
		super(advertisementId, priority, noOfDays, clientName);
		this.inches = inches;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	
    // Override the abstract method
    
    @Override
    public float calculateAdvertisementCharge(float baseCost){
        float baseAdvertisementCost=baseCost*inches*noOfDays;
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