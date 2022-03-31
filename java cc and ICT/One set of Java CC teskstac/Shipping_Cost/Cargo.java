package java_lc_cc.Shipping_Cost;

public class Cargo {
	private Long id;
	private Integer length;
	private Integer width;
	private Integer weight;
	private String cargoType; 
	private String storageType; //Dry Storage or Cold Storage

	public static String DRY_STORAGE = "DRY";
	public static String COLD_STORAGE = "COLD";

	public Cargo(String value) {
		String val[] = value.split(",");
		id = Long.parseLong(val[0]);
		length = Integer.parseInt(val[1]);
		width = Integer.parseInt(val[2]);
		weight = Integer.parseInt(val[3]);
		cargoType = val[4];
		storageType = val[5];
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	@Override
	public String toString() {
		return getId()+"," + getLength()+"," + getWidth()+"," + getWeight()+"," + getCargoType()+"," + getStorageType();
	}

}
