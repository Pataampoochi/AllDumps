import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

public static void main(String [] args)throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Recharged date");
    String date=br.readLine();
    String currentDate="29/10/2019";
    if(Main.isValidFormat(date)&&(Main.dateCompare(date,currentDate))){
        System.out.println("Validity days");
        int days=Integer.parseInt(br.readLine());
        if(days>0)
        System.out.println(Main.futureDate(date,days));
        else
        System.out.println(days+ "is not a valid days");
    }
    else
    System.out.println(date+ "is not a valid date");
}
public static boolean isValidFormat(String date){
    String regex="^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher((CharSequence)date);
    return matcher.matches();
}
public static boolean dateCompare(String date1,String date2)throws ParseException{
    SimpleDateFormat sdformat=new SimpleDateFormat("dd/MM/yyyy");
    Date d1=sdformat.parse(date1);
    Date d2=sdformat.parse(date2);
    if((d1.compareTo(d2)<0)||(d1.compareTo(d2)==0))
    return true;
    else
    return false;
}
public static String futureDate(String date,int days){
    Calendar c=Calendar.getInstance();
    SimpleDateFormat sdformat=new SimpleDateFormat("dd/MM/yyyy");
    try{
        Date mydate=sdformat.parse(date);
        c.setTime(mydate);
        c.add(Calendar.DATE, days);
    }catch(ParseException e){
        e.printStackTrace();
    }
    String toDate=sdformat.format(c.getTime());
    return toDate;
}
}