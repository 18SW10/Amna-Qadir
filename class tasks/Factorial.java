import java.util.*;
class Factorial{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to find its factorial:");
int n=sc.nextInt();
int fact=1;
for(int x=n;x>=1;--x){
fact=fact*x;


}System.out.println("factorial="+fact);
}
}