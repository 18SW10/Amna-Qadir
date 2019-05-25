public  class Rectangle extends Shape{
  private double width,length;

   Rectangle(){
	   this.width=0;
	   this.length=0;
	   }
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
		}
	Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
		}
	public void setWidth(double width){
		this.width=width;
		}
	public  double getWidth(){
		return this.width;
		}
	public void setLength(double length){
				this.length=length;
				}
	public  double getLength(){
				return this.length;
		}
		public  double getArea(){
			double area=this.length*this.width;
			return area;
			}
		public double getPerimeter(){
			double perimeter=2*(length+width);
			return perimeter;
			}
	public  String toString(){
			return("Rectangle[color="+getColor()+",filled="+isFilled()+",Area="+getArea()+",Perimeter="+getPerimeter()+"]");
		}
	}