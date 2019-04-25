
import java.util.*;
class Task2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("please enter number to print its table:");
int a=sc.nextInt();
System.out.println(" enter starting number of table:");
int b=sc.nextInt();
System.out.println("enter end point number:");
int c=sc.nextInt();
for(int i=b;i<=c;i++){
System.out.print(a+"*"+i+"="+(a*i)+"\n");
}System.out.println("\n");


}
}