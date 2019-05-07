class Student{
 String name,rollnum,gender,dept;
 int age;
 Student(int age,String name,String rollnum,String gender,String dept){
 this.name=name;
 this.rollnum=rollnum;
 this.age=age;
 this.gender=gender;
 this.dept=dept;

 }

 void ShowDetails(){
 System.out.print("Name="+name+"\n"+"Rollnum:"+rollnum+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n"+"Department:"+dept+"\n");
 }
}