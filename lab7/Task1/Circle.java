class Circle{
	private double radius;
	private String color;
	static double pi=3.142;
	public double area;
	Circle(){
		this.radius=0;
		this.color="";
		}
	Circle(double radius){
		this.radius=radius;
		this.color="";
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
		}
	public double getRadius(){
		return this.radius;
		}
	public void setRadius(double radius){
		this.radius=radius;
		}
	public String getColor(){
		return color;
		}
	public void setColor(String color){
		this.color=color;
		}
	public double getArea(){

		area=pi*radius*radius;
		return area;
		}
	public String toString(){
		return ("Circle[radius="+this.radius+",color="+this.color+"]");
		}
	}