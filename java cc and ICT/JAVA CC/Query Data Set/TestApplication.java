import java.util.*;
public class TestApplication {
    //Write the required business logic as expected in the question description
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        Query q= new Query();
        Query.DataSet pd= q.new DataSet();
        Query.DataSet sd= q.new DataSet();
        System.out.println("Enter the Details for primary data set");
        System.out.println("Enter the theatre id");
        pd.setTheatreId(sc.nextLine());
        System.out.println("Enter the theatre name");
        pd.setTheatreName(sc.nextLine());
        System.out.println("Enter the location");
        pd.setLocation(sc.nextLine());
        System.out.println("Enter the no of screens");
        pd.setNoOfScreen(sc.nextInt());
        System.out.println("Enter the ticket cost");
        pd.setTicketCost(sc.nextDouble());
        
        System.out.println("Enter the Details for secondary data set");
        System.out.println("Enter the theatre id");
        String id2=sc.next();
        // System.out.println(id2);
        sd.setTheatreId(id2);
        System.out.println("Enter the theatre name");
        sc.nextLine();
        sd.setTheatreName(sc.nextLine());
        System.out.println("Enter the location");
        String gll=sc.nextLine();
        sd.setLocation(gll);
        System.out.println("Enter the no of screens");
        
        // System.out.println(gll);
        // String pp=sc.nextLine();
        // System.out.println(pp);
        sd.setNoOfScreen(sc.nextInt());
        System.out.println("Enter the ticket cost");
        sd.setTicketCost(sc.nextDouble());
        sc.nextLine();
        System.out.println("Enter the query id");
        q.setQueryId(sc.nextLine());
        System.out.println("Enter the query category");
        q.setQueryCategory(sc.nextLine());
        
        q.setSecondaryDataSet(sd);
        q.setPrimaryDataSet(pd);
        System.out.println(q.toString());
        
    }
}