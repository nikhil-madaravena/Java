
public class Cylinder {
	int radius;
	int height;
	
	public Cylinder(int radius) {
		this.radius = radius;
		this.height = 2*radius;
	}
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume() {
		return (double)3.14*radius*radius*height;
	}
	
	public double getArea() {
		return (double)2*3.14*radius*(radius+height);
	}
}
