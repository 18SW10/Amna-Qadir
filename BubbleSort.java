import java.util.*;
class BubbleSort{
public static void main(String args[]){
int a,swap;
int arr[]={5,3,7,2,9,1,6,4,8};
for( a=0;a<arr.length;a++){
for(int b=0;b<arr.length-a-1;b++){
if(arr[b] > arr[b+1]){
swap=arr[b];
arr[b]=arr[b+1];
arr[b+1]=swap;
}
}
}
System.out.println("Sorted array:");
for(a=0;a<arr.length;a++)
System.out.println(arr[a]);

}
}