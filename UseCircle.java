

public class UseCircle {
	public static void main(String[] args) {
		double radius = 12.5;
		String color= "Black";
		Circle cir= new Circle(radius, color);
		cir.getArea();
		cir.getRadius();
		System.out.println(cir.toString());
	}
}
