public abstract class Shape{
	private String color;
	private boolean filled;
	Shape(){
		this.color="";

		}
	Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
		}
  public void setColor(String color){
	  this.color=color;
	  }
public String getColor(){
	return color;
	}
public void setFilled(boolean filled){
	this.filled=filled;
	}
public boolean isFilled(){
	return this.filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
	}