class RectangleMain{
public static void main(String args[]){

Rectangle r=new Rectangle(2.0,2.0,"red",true);

r.setWidth(2.0);
r.getWidth();
r.setLength(2.0);
r.getLength();
r.getArea();
r.getPerimeter();
System.out.print(r.toString());
}
}