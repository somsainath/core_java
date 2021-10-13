import java.util.*;
enum Gender{
	Male,Female;
	}
class contact <T>{
	private T[] arr;
	long phoneNumber;
	String name;
	String Email;
	Object Gender;
	contact(){}
	public contact(String name, String email,Object Gender) {
		super();
		this.phoneNumber = this.phoneNumber;
		this.name = name;
		this.Gender=Gender;
		this.Email = email;
	} 
	public String toString() {
		return "["+name+", "+Email+", "+Gender+"]";
		 		
	}
}
public class Collections1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		contact[] obj=new contact[5];
		obj[0]=new contact<Object>("Ram","ram1@gmail.com",M);
		obj[1]=new contact<Object>("Sita","sita2@gmail.com",M);
		obj[2]=new contact<Object>("Gita","gita3@gmail.com",M);
		obj[3]=new contact<Object>("Ravi","ravi4@gmail.com",F);
		obj[4]=new contact<Object>("Somu","somu5@gmail.com",F);
		TreeMap<Long,contact> t= new TreeMap<Long,contact>(Collections.reverseOrder());
		t.put((long)963767390,obj[0]);
		t.put((long)964378961,obj[1]);
		t.put((long)961768767,obj[2]);
		t.put((long)961879867,obj[3]);
		t.put((long)967987987,obj[4]);
		System.out.println("-----Keys----\n");
		for(Map.Entry m1:t.entrySet()){ 
			System.out.println(m1.getKey());
		}
		System.out.println("\n----Values----\n");
			for(Map.Entry m:t.entrySet()){ 
				System.out.println(m.getValue().toString());
			}
			System.out.println("\n-----KeyValue pairs-----\n");
		for(Map.Entry m:t.entrySet()){ 
		       System.out.println(m.getKey()+" :"+m.getValue().toString());    
		      }    
	    }
        }