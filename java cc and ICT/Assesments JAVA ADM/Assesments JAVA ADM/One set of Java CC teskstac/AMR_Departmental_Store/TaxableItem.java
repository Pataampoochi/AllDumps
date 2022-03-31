package java_lc_cc.AMR_Departmental_Store;

public class TaxableItem extends Item {
	private float GST;
	private float taxAmount;

	public float getGST() {
		return GST;
	}

	public void setGST(float gST) {
		GST = gST;
	}

	public float getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}

	public int findTaxAmount() {
		if ((getItemCost() > 0) && (GST > 0)) {
			taxAmount = getItemCost() * (GST / 100);
		float totalcost =getItemCost() + taxAmount;
			setTotalCost(totalcost);
			return 1;
		} else
			return -1;
	}

}
