import java.util.*;
class Array{
	int[] arr=new int[5];
	public void PopulateArray(){
		for(int i=0;i<5;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number:");
			arr[i]=sc.nextInt();
		}
	}
	void Even(){
		System.out.println("Even numbers:"+"\t");
	for(int i=0;i<5;i++){
		if(arr[i]%2==0){
			System.out.println(arr[i]+"\t");
			}
		}
	}
		void Odd(){
			System.out.println("Odd numbers:"+"\t");
					for(int i=0;i<5;i++){
						if(arr[i]%2!=0){
						System.out.println(arr[i]+"\t");
						}
		}
	}
}