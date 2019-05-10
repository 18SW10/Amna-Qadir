class PrintCount{
	public static void main(String args[]){
		Count c=new Count();
		c.setValue();
		c.setValue();
		c.setValue();
		System.out.println("no: of object created="+Count.count);
		}
	}