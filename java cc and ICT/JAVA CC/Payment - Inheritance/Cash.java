
public class Cash extends Payment
{
    private int cashAmount;

    public int getCashAmount() {
	    return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
	    this.cashAmount = cashAmount;
    }
public boolean payAmount()
{
    return getCashAmount() >= getDueAmount();
}
    
    



    
}