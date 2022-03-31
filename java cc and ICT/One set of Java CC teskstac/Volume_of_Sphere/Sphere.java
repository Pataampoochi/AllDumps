package java_lc_cc.Volume_of_Sphere;

public class Sphere extends Shape {

	private int radius;

	public Sphere() {
		super();
	}

	public Sphere(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calculateVolume(){
	    	//fill in the logic
	    	return (4 * Math.PI * Math.pow(radius, 3) / 3);
	}
}

