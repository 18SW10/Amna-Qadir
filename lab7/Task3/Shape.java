public  class Shape{
	private String color="red";
	private boolean filled=true;
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

	public  String toString(){
		return("Shape[color="+this.color+",filled="+this.filled+"]\n");
		}
	}