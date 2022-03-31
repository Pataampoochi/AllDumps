package java_lc_cc.Payment_Data_Migration;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of payments:");
		int numOfPayments = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter number of threads to process the data:");
		List<String> csvInput = new ArrayList<String>();
		for (int i = 0; i < numOfPayments; i++) {
			csvInput.add(sc.nextLine());
		}
		
		System.out.println("Enter number of threads to process the data:");
		int numOfThreads = Integer.parseInt(sc.nextLine());
		List<Payment> paymentList = new ArrayList<Payment>();
		BuildPaymentThread bpt = null;
		
		for (int i = 0; i < numOfThreads; i++) {
			bpt = new BuildPaymentThread(paymentList, csvInput);
			Thread th = new Thread(bpt);
			try {
				th.start();
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < numOfPayments; i++) {
			System.out.println(bpt.getPaymentList().get(i));
		}
	}

}
