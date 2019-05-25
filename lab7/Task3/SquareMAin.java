class SquareMain{
public static void main(String args[]){
Shape s=new Shape("yelow",true);
Square sq=new Square(2.0,"yellow",true);
Rectangle r=new Rectangle(1.0,2.0,"yellow",true);
System.out.print(s.toString()+r.toString()+sq.toString());

}
}