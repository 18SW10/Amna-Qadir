import java.util.*;
class StudentMarksheet{
	String name, rollnum, gender,dept;
	int age, CP,DCLD,OOP;
	double total,percent;
char grade;
StudentMarksheet(){
String name;
String rollnum;
String gender;
String dept;
int age;
int CP,DCLD,OOP;
double total,percent;
char grade;
}
void SetDetails(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter name of student:");
this.name=sc.nextLine();
System.out.print("Enter rollnum of student:");
this.rollnum=sc.nextLine();
System.out.print("Enter gender of student:");
this.gender=sc.nextLine();
System.out.print("Enter dept of student:");
this.dept=sc.nextLine();
System.out.print("Enter age of student:");
this.age=sc.nextInt();
System.out.print("enter marks of C++ subject:");
this.CP=sc.nextInt();
System.out.print(" enter marks of DCLD  subject:");
this.DCLD=sc.nextInt();
System.out.print("enter marks of OOP subject:");
this.OOP=sc.nextInt();
this.total=(this.CP+this.OOP+this.DCLD);

 this.percent=(total/300)*100;

 }
 char Grade(){
if(percent>90){
grade='A';
return grade;
}
else if((percent<=90)&&(percent>=80)){
grade='B';
return grade;
}
else if( (percent<=79)&&(percent>=70)){
grade='C';
return grade;
}
else if((percent<=69)&&(percent>60)){
grade='D';
return grade;
}
else if(percent<=60){
grade=0;
return grade;
}return grade;
}
void StudentResult(){
System.out.print("Name:"+this.name+"\n");
System.out.print("Rollnum:"+this.rollnum+"\n");
System.out.print("Gender:"+this.gender+"\n");
System.out.print("Department:"+this.dept+"\n");
System.out.print("Age:"+this.age+"\n");
System.out.print("Marks in CP subject:"+this.CP+"\n");
System.out.print("Marks in DCLD subject:"+this.DCLD+"\n");
System.out.print("Marks in OOP subject:"+this.OOP+"\n");
System.out.print("Total marks obtained:"+total+"\n");
System.out.print("Percentage:"+percent+"\n");
System.out.println("Grade="+grade+"\n");
	}
}

