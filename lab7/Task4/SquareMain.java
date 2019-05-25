class SquareMain{
public static void main(String args[]){

Square s=new Square(2.0,"red",true);

s.setSide(2.0);
s.getSide();
s.setLength(2.0);
s.setWidth(2.0);

System.out.print(s.toString());
}
}