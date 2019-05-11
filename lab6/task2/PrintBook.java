class PrintBook{
public static void main(String args[]){
Author a1=new Author("Allama Iqbal","iqbal99@gmail.com",'m');
a1.getName();
a1.getEmail();
a1.getGender();
a1.setEmail("iqbal99@gmail.com");
a1.toString();
Author a2=new Author("Allama I.I Kazi","allama199@gmail.com",'m');
a2.getName();
a2.getEmail();
a2.getGender();
a2.setEmail("allama199@gmail.com");
a2.toString();
Author[] a={a1,a2};
Book b=new Book("Kalyat E Iqbal",a,1500,2);
b.getName("Kalyat E Iqbal");
b.getAuthor(a);
b.getPrice(1500);
b.getQty(2);
b.setPrice(1500);
b.setQty(2);
System.out.print(b.toString());
}
}