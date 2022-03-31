public class Account {
    long accountNumber;
    double balanceAmount;
    
    
    public Account(long accno, double bal){
        super();
        this.accountNumber=accno;
        this.balanceAmount=bal;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accno){
        this.accountNumber=accno;
    }
    public double getBalanceAmount(){
        return balanceAmount;
    }
    public void setBalanceAmount(double bal) {
        this.balanceAmount=bal;
    }
    public void deposit(double depositAmt){
        float total=(float)(balanceAmount+depositAmt);
        balanceAmount=total;
    }
    public boolean withdraw(double withdrawAmt){
        float total;
        if(withdrawAmt>balanceAmount){
            System.out.println("Insufficient balance");
            
            return false;
        }else{
            total=(float)(balanceAmount-withdrawAmt);
            setBalanceAmount(total);
            return true;
        }
    }
}