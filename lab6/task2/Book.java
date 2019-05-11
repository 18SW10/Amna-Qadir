class Book{
private String name;
private Author[] author;
private double price;
private int qty;
public Book(String name,Author[] author,double price){
	this.name=name;
	this.author=author;
	this.price=price;
	this.qty=0;
	}
public Book(String name,Author[]author,double price,int qty){
	this.name=name;
	this.author=author;
	this.price=price;
	this.qty=qty;
	}
public String getName(String name){
	return name;
	}
public Author[] getAuthor(Author[] author){
	return author;
	}
public double getPrice(double price){
	return price;
	}
public int getQty(int qty){
	return qty;
	}
public void setPrice(double price){
	this.price=price;
	}
public void setQty(int qty){
	this.qty=qty;
	}
public String toString(){
	String s=" ";
	for(int i=0;i<author.length;i++)

	s+=author[i];

	return ("Book[name="+this.name+",authors="+ s +",price="+this.price+",qty="+this.qty);
	}
}