class Task2{
public static void main(String args[]){
int x;
x=Integer.parseInt(args[0]);
if(x%2==0){
System.out.println("Even?");

System.out.println(((x>0)&&(x%2==0))+"\n"+"Number "+x+"is even");
}
else{
	System.out.println("Odd?");
System.out.println(((x>0)&&(x%2!=0))+"\n"+"Number "+x+" is odd");
}
}
}