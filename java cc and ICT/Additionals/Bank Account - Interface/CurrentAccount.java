
public class CurrentAccount extends Account implements MaintenanceCharge 
{
    
	public CurrentAccount(String customerName, String accountNumber, double balance) {
		super(customerName, accountNumber, balance);
		
	}
	
	// Override the abstract method
	
    public float calculateMaintenanceCharge(float noOfYears) {
        return (100.0f * noOfYears) + 200.0f;
    }
	
	
}