
public class SavingsAccount extends Account implements MaintenanceCharge  
{
    public SavingsAccount(String customerName, String accountNumber, double balance) 
    {
        super(customerName, accountNumber, balance);
		
	}

    // Override the abstract method
    

    public float calculateMaintenanceCharge(float noOfYears) {
        return (50.0f * noOfYears) + 50.0f;
    }
    
    
}