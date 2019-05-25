class CircleMain{
public static void main(String args[]){

Circle c=new Circle("red",true,2.0);

c.setRadius(2.0);
c.getRadius();
c.getArea();
c.getPerimeter();
System.out.print(c.toString());
}
}