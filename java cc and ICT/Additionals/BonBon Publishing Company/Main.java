import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
	 
	    //Type your code here
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the advertisement id");
	    int id=input.nextInt();
	    System.out.println("Enter the priority (high / medium / low)");
	    String priority=input.next();
	    System.out.println("Enter the no of days advertisement is published");
	    int noOfDays=input.nextInt();
	    input.nextLine();
	    System.out.println("Enter the client name");
	    String clientName=input.nextLine();
	    System.out.println("Enter the type of Advertisement (video/image/text)");
	    String type=input.next();
	    if(type.equals("video")){
	        System.out.println("Enter the duration in minutes");
	        int duration=input.nextInt();
	        VideoAdvertisement ad1=new VideoAdvertisement(id,priority,noOfDays,clientName,duration);
	        System.out.println("Enter the base cost");
	        float baseCost=(float)input.nextDouble();
	        System.out.printf("The Advertisement cost is %.1f",ad1.calculateAdvertisementCharge(baseCost));
	    }
	    else if(type.equals("image")){
	        System.out.println("Enter the number of inches");
	        int inches=input.nextInt();
	        ImageAdvertisement ad1=new ImageAdvertisement(id,priority,noOfDays,clientName,inches);
	        System.out.println("Enter the base cost");
	        float baseCost=(float)input.nextDouble();
	        System.out.printf("The Advertisement cost is %.1f",ad1.calculateAdvertisementCharge(baseCost));
	    }
	    else if(type.equals("text")){
	        System.out.println("Enter the number of characters");
	        int characters=input.nextInt();
	        TextAdvertisement ad1=new TextAdvertisement(id,priority,noOfDays,clientName,characters);
	        System.out.println("Enter the base cost");
	        float baseCost=(float)input.nextDouble();
	        System.out.printf("The Advertisement cost is %.1f",ad1.calculateAdvertisementCharge(baseCost));
	    }
	    
	}
	
}