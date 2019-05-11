class Student{
public String name,address;
public int age;
 Student(){
this.name="Unknown";
this.address="not available";
this.age=0;
}
public void setInfo(String name,int age){
this.name=name;
this.age=age;
address=null;
}
public void setInfo(String name,String address,int age){
this.name=name;
this.age=age;
this.address=address;
	System.out.print("Name: "+name+" Age: "+age+" Address: "+address+"\n");
	}
	Student[] s=new Student[10];
	public void setStudent(Student[] s){
	this.s=s;
	}
	public Student[] getS(){
	return s;
	}

}