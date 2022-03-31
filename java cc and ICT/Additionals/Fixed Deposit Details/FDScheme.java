import java.util.*;
class FDScheme{
    private int schemeNo;
    private double depositAmt;
    private int period;
    private float rate;
    public FDScheme(int schemeNo, double depositAmt, int period){
        super();
        this.schemeNo=schemeNo;
        this.depositAmt=depositAmt;
        this.period=period;
        calculateInterestRate();
    }
    public int getSchemeNo(){
        return schemeNo;
    }
    public void setSchemeNo(int schemeNo)
    {
        this.schemeNo=schemeNo;
    }
    public double getDepositAmt(){
        return depositAmt;
    }
    public void setDepositAmt(double depositAmt)
    {
        this.depositAmt=depositAmt;
    }
    public int getPeriod()
    {
        return period;
    }
    public void setPeriod(int period){
        this.period=period;
    }
    public float getRate(){
        return rate;
    }
    public void setRate(float rate){
        this.rate=rate;
    }
    public void calculateInterestRate()
    {
        if(period>=1 && period<=90)
        {
            this.rate=(float)5.5;
        }
        else if(period>=91 && period<=180)
        {
            this.rate=(float)6.25;
        }
        else if(period>=181 && period<=365)
        {
            this.rate=(float)7.5;
        }
        System.out.println("Interest rate for"+period+"days is"+this.rate);
    }
}