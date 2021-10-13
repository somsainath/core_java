import java.util.*;
class Employee{
	int id;
	String name;
	String dept;
	double salary;
	Employee(){}
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	void display(HashSet<Employee> o){
		for(Employee b:o){  
		    System.out.println(b.id+" "+b.name+" "+b.dept+" "+b.salary);  
	}
	}
}
class customer{
	
}
public class Generics1 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee(1,"A","CSE",40000);
		Employee emp2=new Employee(2,"B","ECE",26000);
		Employee emp3=new Employee(3,"C","EEE",31050);
		Employee emp4=new Employee(4,"D","Mech",29080);
		HashSet<Employee> set=new HashSet<Employee>();  
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        emp.display(set);
	}

}
