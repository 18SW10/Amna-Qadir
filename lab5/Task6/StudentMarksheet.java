class StudentMarksheet{
	Student s;
	Marksheet m;
	StudentMarksheet(Student s,Marksheet m){
	this.s=s;
	this.m=m;
	}
	void StudentResult(){
	s.ShowDetails();
	m.total();
	m.percent();
	m.Grade();
	m.ShowDetails();
	}
}