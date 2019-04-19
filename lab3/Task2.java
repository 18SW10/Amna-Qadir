import java.util.*;
class Task2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of units:");
int unit=sc.nextInt();
int bill;
if(unit<=50){
bill=unit*10;
System.out.println("Bill="+bill);
}
else if(unit>50&unit<=100){
bill=(unit-50)*15 +50*10;
System.out.println("Bill="+bill);
}
else if(unit>100&unit<=200){
bill=(unit-100)*20+50*10+49*15;
System.out.println("Bill="+bill);
}
else if(unit>200&unit<=300){
bill=(unit-200)*25+50*10+49*15+99*20;
System.out.println("Bill="+bill);
}
else if(unit>300){
bill=(unit-300)*30+50*10+49*15+99*20+99*25;
System.out.println("Bill="+bill);
}
}
}