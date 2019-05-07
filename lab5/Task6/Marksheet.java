class Marksheet{
int dcld,oop,cp;
double total,percent;
char grade;
Marksheet(int dcld,int oop,int cp){
this.dcld=dcld;
this.oop=oop;
this.cp=cp;
}
void total(){
total=cp+dcld+oop;
}
void percent(){
percent=(total/300)*100;
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
void ShowDetails(){
System.out.print("marks in CP="+cp+"\n");
System.out.print("marks in OOP="+oop+"\n");
System.out.print("marks in DCLD="+dcld+"\n");
System.out.print("Total obtained marks="+total+"\n");
System.out.print("Percentage="+percent+"\n");
System.out.print("Grade="+grade+"\n");
}
}
