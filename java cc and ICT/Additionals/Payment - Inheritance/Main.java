import java.util.*;
public class Main {
    
	public static void main(String[] args) {
	    
	 // Fill your code    
	 Bill bill=new Bill();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the due amount;");
	  int dueAmount=sc.nextInt();
	  System.out.println("Enter the mode of payment(cheque/cash/credit):");
	  String mode=sc.next();
	  switch(mode)
	  {
	      case "cash" : System.out.println("Enter the cash amount:");
	                    int cashAmount=sc.nextInt();
	                    Cash cash=new Cash();
	                    cash.setCashAmount(cashAmount);
	                    cash.setDueAmount(dueAmount);
	                    System.out.println(bill.processPayment(cash));
	                    break;
	       case "cheque" : System.out.println("Enter the cheque number:");
	                        String number=sc.next();
	                        System.out.println("Enter the cheque amount:");
	                        int chequeAmount=sc.nextInt();
	                        System.out.println("Enter the date of issue:");
	                        String date=sc.next();
	                        Cheque cheque=new Cheque();
	                        cheque.setChequeAmount(chequeAmount);
	                        cheque.setChequeNo(number);
	                        cheque.generateDate(date);
	                        cheque.setDueAmount(dueAmount);
	                        System.out.println(bill.processPayment(cheque));
	                        break;
	       case "credit" : System.out.println("Enter the credit card number:");
	                        int creditNumber = sc.nextInt();
	                        System.out.println("Enter the card type(silver,gold,platinum):");
	                        String cardType=sc.next();
	                        Credit credit=new Credit();
	                        credit.setCardType(cardType);
	                        credit.setCreditCardNo(creditNumber);
	                        credit.setDueAmount(dueAmount);
	                        System.out.println(bill.processPayment(credit));
	                        break;
	       default:
	       break;
	  }
	    
		sc.close();
	}

}