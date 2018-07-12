import java.awt.Color;

public class Marker{
	
	//data members:
	private String type;
	private Color color;
	private int ink;
	
	public Marker(String t, Color c, int i) {
		setType(t);
		setColor(c);
		setInk(i);
	}
	
	public void write (String text) {
		if (text.length() <= ink) {
			System.out.println("Imagine this getting printed in "+ color+"....."+ text);
			ink -= text.length();
		}else {
			System.out.println("Imagine this getting printed in "+ color+"....."+ text.substring(0, ink));
			ink = 0;
		}
		
	}
	
	public void setType (String t) {
		type= t;
	}
	
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
	
	public void setInk(int i) {
		if (i >=0 && i <=100) {
			ink = i;
		}else {
			ink = 100;
		}
	}
	
	
	public void showInfo() {
		System.out.println("Type: "+ type + "\tColor: " + color+ "\tink: " + ink +"%");
		
	}

}
