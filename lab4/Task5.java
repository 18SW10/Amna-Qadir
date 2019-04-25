class Task5{
public static void main(String []args){
int []arr={7,4,8,1,2};
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(max<arr[i])
max=arr[i];


}System.out.println("Largest="+max);

}
}