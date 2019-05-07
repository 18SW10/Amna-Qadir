class PrintStudentMarksheet{
public static void main(String args[]){
Student s=new Student(18,"Amna","18Sw10","Female","Software");
Marksheet m=new Marksheet(65,65,65);
StudentMarksheet sm=new StudentMarksheet(s,m);
sm.StudentResult();
}
}