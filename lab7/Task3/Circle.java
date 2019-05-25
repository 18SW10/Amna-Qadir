public  class Circle extends Shape{
	private double radius=1.0;
	static double pi=3.142;
	Circle(double radius){
		this.radius=radius;
		}
	Circle(String color,boolean filled,double radius){

		super(color,filled);
		this.radius=radius;
		}
	public void setRadius(double radius){
		this.radius=radius;
		}
	public double getRadius(){
		return radius;
		}
		public double getArea(){
		double area=pi*radius*radius;
		return area;
			}
			public  double getPerimeter(){
				double perimeter=2*pi*radius;
				return perimeter;
				}
	public String toString(){
		return("Circle[Area="+getArea()+",Perimeter="+getPerimeter()+"]");
		}
	}