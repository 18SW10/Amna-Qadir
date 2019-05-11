class PrintAuthor{
public static void main(String args[]){
Author a=new Author("Gul Shahzad sarwar","shahzad11@gmail.com",'m');
a.getName();
a.getEmail();
a.getGender();
a.setEmail("shahzad11@gmail.com");
System.out.print(a.toString());

}
}