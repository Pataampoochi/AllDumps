package java_lc_cc.SetCategoryAndViewProductDetails;


public class Product {
	private int prodId;
	private String prodName;
	private double unitPrice;
	private char category;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public char getCategory() {
		return category;
	}
	public void setProductCategory() {
		if((getUnitPrice()>=100)&&(getUnitPrice()<=999))
			category='C';
		if((getUnitPrice()>=1000)&&(getUnitPrice()<=9999))
			category='B';
		if((getUnitPrice()>=10000)&&(getUnitPrice()<=99999))
			category='A';
	}

}
