package java_lc_cc.Payment_Data_Migration;

import java.text.*;
import java.util.*;

public class BuildPaymentThread extends Thread {

	private List<Payment> paymentList;
	private List<String> csvInput;
	
	public BuildPaymentThread(List<Payment> paymentList, List<String> csvInput) {
		super();
		this.paymentList = paymentList;
		this.csvInput = csvInput;
	}

	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public List<String> getCsvInput() {
		return csvInput;
	}

	public void setCsvInput(List<String> csvInput) {
		this.csvInput = csvInput;
	}
	
	public void run() {
		for (int i = 0; i < csvInput.size(); i++) {
			try {
				Long id = Long.parseLong(csvInput.get(i).split(",")[0]);
				Double amount = Double.parseDouble(csvInput.get(i).split(",")[1]);
				DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				Date createdDate = format.parse(csvInput.get(i).split(",")[2]);
				Date paymentDate = format.parse(csvInput.get(i).split(",")[3]);
				Integer mode = Integer.parseInt(csvInput.get(i).split(",")[4]);
				CreditCard card = null;
				Cheque cheque = null;
				String status = null;
				if (mode == 1) {
					String cardNumber = csvInput.get(i).split(",")[5];
					Date cardExpire = format.parse(csvInput.get(i).split(",")[6]);
					String name = csvInput.get(i).split(",")[7];
					Integer cvv = Integer.parseInt(csvInput.get(i).split(",")[8]);
					status = csvInput.get(i).split(",")[9];
					card = new CreditCard(cardNumber, cardExpire, name, cvv);
				} else if (mode == 2) {
					String bankName = csvInput.get(i).split(",")[5];
					String chequeNumber = csvInput.get(i).split(",")[6];
					Date chequeDate = format.parse(csvInput.get(i).split(",")[7]);
					status = csvInput.get(i).split(",")[8];
					cheque = new Cheque(bankName, chequeNumber, chequeDate);
				}
				paymentList.add(new Payment(id, amount, createdDate, paymentDate, mode, card, cheque, status));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
