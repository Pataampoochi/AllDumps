
public class Credit extends Payment
{
    private int creditCardNo;
	private String cardType; //(silver,gold,platinum) String,
	private int creditCardAmount;
	public int getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCreditCardAmount() {
		return creditCardAmount;
	}
	public void setCreditCardAmount(int creditCardAmount) {
		this.creditCardAmount = creditCardAmount;
	}
	public Credit(int creditCardNo, String cardType) {
		super();
		
		// Fill your code 
		
		
		
	}
	public Credit()
	{
	    
	}
    
    // Fill your code 
    @Override
    public boolean payAmount()
    {
        int tax=0;
        boolean isDeducted=false;
        switch(cardType)
        {
            case "silver": setCreditCardAmount(10000);
                            tax=(int)(0.02*getDueAmount())+getDueAmount();
                            if(tax<=getCreditCardAmount())
                            {
                                setCreditCardAmount(getCreditCardAmount()-tax);
                                isDeducted=true;
                            }
                            break;
            case "gold": setCreditCardAmount(50000);
                            tax=(int)(0.05*getDueAmount())+getDueAmount();
                            if(tax<=getCreditCardAmount())
                            {
                                setCreditCardAmount(getCreditCardAmount()-tax);
                                isDeducted=true;
                            }
                            break;
            case "platinum": setCreditCardAmount(100000);
                            tax=(int)(0.1*getDueAmount())+getDueAmount();
                            if(tax<=getCreditCardAmount())
                            {
                                setCreditCardAmount(getCreditCardAmount()-tax);
                                isDeducted=true;
                            }
                            break;
        }
        return isDeducted;
    }
}