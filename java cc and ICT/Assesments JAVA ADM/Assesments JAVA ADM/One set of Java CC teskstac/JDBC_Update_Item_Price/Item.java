package java_lc_cc.JDBC_Update_Item_Price;

public class Item 
{
	private String id;
	private String name;
	private Double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Item(String id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

