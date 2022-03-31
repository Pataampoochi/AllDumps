package com.ui;
import com.utility.Player;
import java.util.*;

public class UserInterface {

		public static void main(String[] args) {
			
			// fill the code
			Scanner sc=new Scanner(System.in);
			Player p=new Player();
			p.setScoreList(new ArrayList<>());
			boolean flag=true;
			while(flag)
			{
			    System.out.println("1. Add Runs Scored");
			    System.out.println("2. Calculate average runs scored");
			    System.out.println("3. Exit");
			    System.out.println("Enter your choice");
			    int choice=sc.nextInt();
			    switch(choice) 
			    {
			        case 1: {
			            System.out.println("Enter the runs scored");
			            int runScored=sc.nextInt();
			            p.addScoreDetails(runScored);
			            break;
			        }
			        case 2: {
			            System.out.println("Average runs secured");
			            System.out.println(p.getAverageRunScored());
			            break;
			        }
			        case 3: {
			            System.out.println("Thank you for using the Application");
			            flag=false;
			            break;
			        }
			    }
			}
			
		}

	}

