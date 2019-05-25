public class CircleCylinder{
	public static void main(String args[]){
		Cylinder c=new Cylinder(1.0,2,"red");

		c.setHeight(2);
		c.getHeight();
        c.getArea();
		System.out.print(c.toString()+"\n"+"volume="+c.getVolume());
		}
	}