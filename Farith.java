
public class Farith {
	public static void main(String[] args) {
	String s ="Hexaware@123";
	String a=s.substring(0, 8);
	System.out.println(a);
int count=0,count1=0;
for(int i=0;i<a.length();i++) {
	char ch=s.charAt(i);
	if(ch=='a') {
		count++;
	}
	if(ch=='e') {
		count1++;
}
}
System.out.println("count of a"+count);
System.out.println(count1);
	
	
}}

}
