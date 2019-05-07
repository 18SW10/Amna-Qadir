class Task7{
public static void main(String args[]){
String str1="Amna,18,BE-Software";
String str2="Ali,19,BE-Software";
String part1[]=str1.split(",");
String part2[]=str2.split(",");
System.out.println("Name:"+part1[0]+"\n"+"Age:"+part1[1]+"\n"+"Department:"+part1[2]+"\n");
System.out.println("Name:"+part2[0]+"\n"+"Age:"+part2[1]+"\n"+"Department:"+part2[2]+"\n");
}
}