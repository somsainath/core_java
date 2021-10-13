public class Stroperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java String pool refers to collection of Strings which are stored in heap memory";
System.out.println("Lower Case: "+s1.toLowerCase());
System.out.println("Upper Case: "+s1.toUpperCase());
System.out.println(s1.replace('a', '$'));
System.out.println("Verify: "+s1.contains("collection"));
String s2="java string pool refers to collection of strings which are stored in heap memory";
System.out.println("Equal or not: "+s1.equals(s2));
System.out.println(s1==s2);
}
}
