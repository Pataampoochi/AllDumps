import java.util.*;
public class Main 
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            Map<String,Integer> map=new HashMap<>();
            map.put("BEACH",270);
            map.put("PILGRIMAGE",350);
            map.put("HERITAGE",430);
            map.put("HILLS",780);
            map.put("FALLS",1200);
            map.put("ADVENTURES",4500);
            System.out.println("Enter the Passenger Name");
            String pname=sc.next();
            System.out.println("Enter the Place");
            String name=sc.next();
            if(!map.containsKey(name.toUpperCase()))
            {
                System.out.println(name+" is an invalid place");
            }
            else
            {
                System.out.println("Enter the no of Days");
                int nod=sc.nextInt();
                if(nod<=0)
                {
                    System.out.println(nod+" is an invalid days");
                }
                else
                {
                    System.out.println("Enter the no of Tickets");
                    int not=sc.nextInt();
                    if(not<=0)
                    {
                        System.out.println(not+" is an invalid tickets");
                    }
                    else
                    {
                        double d=(double)map.get(name.toUpperCase());
                        double totalcost=d*(double)not*(double)nod;
                        if(totalcost>=1000)
                        {
                            totalcost=totalcost-((totalcost*15)/100);
                        }
                        System.out.printf("Bill Amount is %.2f", totalcost);
                    }
                    
                }
            }
            
            //Fill the code 
        }
}