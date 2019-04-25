import java.util.*;
class Task6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check either it belong to array or not:");
int f=sc.nextInt();
int[]num={1,2,3,4,5,6,7};
boolean found=false;
for(int n:num)
if(n==f){
found=true;
}
if(found){
System.out.print("number "+f+" exist in array.");
}
else{
System.out.print("number "+f+" doesn't exist in array.");

}
}
}