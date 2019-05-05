import java.util.*;
class Marksheet{
int CP,DCLD,OOP;
double total,percent;

public void SetMarks(){
	  int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print("enter marks of C++ subject:");
a=sc.nextInt();
this.CP=a;
System.out.print(" enter marks of DCLD  subject:");
b=sc.nextInt();
this.DCLD=b;
System.out.print("enter marks of OOP subject:");
c=sc.nextInt();
this.OOP=c;

}
public double Total(){

 total=(this.CP+this.OOP+this.DCLD);
System.out.print("Total marks obtained:"+total+"\n");
return total;
}
public double Percent(){
 percent=(total/300)*100;
System.out.print("percentage:"+percent+"\n");
return percent;
}
public void Grade(){
if(percent>90){
System.out.println("Grade=A");
}
else if((percent<=90)&&(percent>=80)){
System.out.println("Grade=B");
}
else if( (percent<=79)&&(percent>=70)){
System.out.println("Grade=C");
}
else if((percent<=69)&&(percent>60)){
System.out.println("Grade=D");
}
else if(percent<=60){
System.out.println("Grade=Fail");
}
else {
System.out.println("Grade=Fail");
}
}
}