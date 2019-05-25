public  class Square extends Rectangle{
	private double side;
	Square(){
		side=0;
		}
	Square(double side){
		this.side=side;
		}
	Square(double side,String color,boolean filled){
		super(side,side,color,filled);
		this.side=side;
		}
	public void setSide(double side){
		this.side=side;
		}
	public double getSide(){
		return side;
	}
	public void setLength(double side){
		this.side=side;
		}
	public  void setWidth(double side){
		this.side=side;
		}
	public  String toString(){
			return("Square[color="+getColor()+",filled="+isFilled()+",Area="+getArea()+",Perimeter="+getPerimeter()+"]");
			}

	}