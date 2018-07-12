import java.awt.Color;

public class MyCar {
	//data member:
	Color color;
	private double fuel;
	private int dis;
	private String brand;
	private String type;
	
	public void setColor(Color c) {
		color = c;
	}
	public void setColor(int r, int b, int g) {
		if (r>=0 && r<=255 && b>=0 && b<=255 && g>=0 && g<=255 ) {
			color = new Color(r, b, g);
		}else {
			color = Color.black;
		}
	}

	public void setFuel (int fu) {
		if (fu >=0 && fu <= 100) {
			fuel = (double) (9*dis)/100;
		}else {
			fuel = 100;
		}
	}
	
	public void setDistance(int di) {
		if (dis <= fuel) {
			dis =di;
			
		}else {
			
		}
	}
}
