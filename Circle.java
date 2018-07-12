
public class Circle {
	private double radius;
	private String color;
	private double Area;
	
	public Circle(double r){
		radius= r;
	}
	public Circle(double r, String c) {
		radius = r;
		color=c;
	}
	public double getRadius () {
		return radius;
	}
	public double getArea() {
		return Area= Math.PI*(Math.pow(radius, 2));
	}
	public String toString() {
		return(color+ " circle of radius "+ radius+" has an area "+ String.format("%.2f",Area) + " sq. units");
	}
}
