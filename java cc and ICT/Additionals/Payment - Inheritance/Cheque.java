import java.util.*;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Cheque extends Payment
{
    private String chequeNo;
	private int chequeAmount;
	private Date dateOfIssue;
	
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public int getChequeAmount() {
		return chequeAmount;
	}
	public void setChequeAmount(int chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	private int findDifference(Date date){
	    Calendar myDate=new GregorianCalendar();
	    myDate.setTime(date);
	    return (2020-myDate.get(Calendar.YEAR))*12+(0-myDate.get(Calendar.MONTH));
	}
	@Override
	public boolean payAmount()
	{
	    int months=findDifference(getDateOfIssue());
	    return (getChequeAmount()>=getDueAmount()&months<=6);
	}
	
	// Fill your code 
	public void generateDate(String date)
	{
	    try{
	        Date issueDate=new SimpleDateFormat("dd-MM-yyyy").parse(date);
	        setDateOfIssue(issueDate);
	    }
	    catch(ParseException e)
	    {
	        e.printStackTrace();
	    }
	}
	
	
}