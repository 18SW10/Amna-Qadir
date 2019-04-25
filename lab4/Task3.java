import java.util.*;
class Task3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of terms you want to enter for sum:");
int n=sc.nextInt();
int j=0;
for(int i=1;i<=n;i++){
System.out.println("Enter number :");
j=sc.nextInt();
j+=j;

}System.out.println("sum="+j);
}
}