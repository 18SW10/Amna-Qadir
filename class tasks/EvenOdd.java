class EvenOdd{
public static void main(String args[]){
int n;
System.out.println("Even numbers:"+"\t"+"Odd numbers");
for(n=0;n<=50;n++){
if(n%2==0){
System.out.print(n+"\t");
}
else if(n%2!=0){
System.out.println("\t"+n);
}
}
}
}