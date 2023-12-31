
public class Circle implements  Comparable<Circle>{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public void setRadius(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	public double getArea() {
	
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

	@Override
	public int compareTo(Circle other) {
		return radius - other.radius;
	
	}
	
	public String toString() {
		return "Circle Area: " + getArea();
	}
	
}
