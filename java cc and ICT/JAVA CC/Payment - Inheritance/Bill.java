
public class Bill {
    
    
    public String processPayment(Payment payObj) {
        String result="Payment not done and your due amount is "+payObj.getDueAmount();
        
        // Fill your code 
        if(payObj instanceof Cheque)
        {
            Cheque cheque=(Cheque)payObj;
            if(cheque.payAmount())
                result="Payment done successfully via cheque";
                
        }
        else if(payObj instanceof Cash)
        {
            Cash cash=(Cash)payObj;
            if(cash.payAmount())
                result="Payment done successfully via cash";
        
        }
        else if(payObj instanceof Credit)
        {
            Credit credit=(Credit)payObj;
            if(credit.payAmount())
                result="Payment done successfully via credit card. Remaining amount in your "+credit.getCardType()+" card is "+credit.getCreditCardAmount();
        }
    
        
        return result;
    }
    
}