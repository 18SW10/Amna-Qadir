class PrintSides{
public static void main(String args[]){
Sides s=new Sides(1.412,1,1);
System.out.print("Hypotenus:"+s.getHyp(1,1)+"\n");
System.out.print("Perpendicular:"+s.getPerp(1.412,1)+"\n");
System.out.print("Base:"+s.getBase(1,1)+"\n");
}
}