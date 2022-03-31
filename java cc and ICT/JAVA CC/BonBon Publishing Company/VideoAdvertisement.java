
public class VideoAdvertisement extends Advertisement
{
    private int duration;  
	
    public VideoAdvertisement(int advertisementId, String priority, int no_of_days, String clientName, int duration) {
		super(advertisementId, priority, no_of_days,clientName);
		this.duration = duration;
	}
    public int getDuration() {
		return duration;
	}

    public void setDuration(int duration) {
		this.duration = duration;
	}
    

    // Override the abstract method
    @Override
    public float calculateAdvertisementCharge(float baseCost){
        float baseAdvertisementCost=baseCost*duration*noOfDays;
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