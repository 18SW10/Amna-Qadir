public class Cylinder extends Circle{
	private double height=1.0;
	Cylinder(){
		this.height=0;
		}
	Cylinder(double radius){
        super(radius);
		}
	Cylinder(double radius,double height){
		super(radius);
		this.height=height;
		}
		Cylinder(double radius,double height,String color){
			super(radius,color);
			this.height=height;
			}
		public double getHeight(){
			return this.height;
			}
		public void setHeight(double height){
			this.height=height;
			}
		public double getVolume(){
			double volume=area*this.height;
			return volume;
			}
	}