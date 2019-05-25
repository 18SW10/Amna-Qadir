class CircleMain{
public static void main(String args[]){
Shape s=new Shape("yelow",true);
Circle c=new Circle("yellow",true,2.0);
c.getRadius();
c.setRadius(2.0);
c.getArea();
c.getPerimeter();
System.out.print(s.toString()+c.toString());

}
}