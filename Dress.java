
public class Dress {

	private double price;
	private int size;
	private String style;
	
	public Dress(double price, int size, String style) {
		this.price = price;
		this.size = size;
		this.style = style;
	}
	
	public int getSize() {
		return this.size;
	}
	public double getPrice() {
		return this.price;
	}
	public String getStyle() {
		return this.style;
	}
	
	public String toString() {
		return "\nPrice: " + getPrice() + " Size: " + getSize() + " Style: " + getStyle();
	}
}
