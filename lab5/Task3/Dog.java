import java.util.*;
class Dog{
String name,breed, age;

void SetDetails(){
Scanner sc=new Scanner(System.in);
String a,b,c;
System.out.print("Enter name of Dog:");

 a=sc.nextLine();
 this.name=a;
System.out.print("enter breed:");
b=sc.nextLine();
this.breed=b;
System.out.println("enter age:");
c=sc.nextLine();
this.age=c;


}
void ShowDetails(){
if((this.name.equals(""))&(this.breed.equals(""))&(this.age.equals(""))){
System.out.print("Details are unavailable.");
}
else
{
System.out.print("\t"+"Dog Details"+"\t");
System.out.print("\n"+"Name:"+name+"\n");
System.out.print("Breed:"+breed+"\n");
System.out.print("Age:"+age+"\n");
}
}
}
