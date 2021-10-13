import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;  
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	int version();
}
//info(AuthorID=1,Author="Naresh",Supervisor="Namss",date="11-8-2020",Time="10:30Am",version=3)
class Devoloper{
	@info(AuthorID=1,Author="Ram",Supervisor="Ravi",Date="01-06-2019",Time="09:30Am",version=3)
	public void Data() {
		System.out.println("Hello Annotation");
	}
	
}
public class Annotations2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Devoloper d=new Devoloper();
		Method m=d.getClass().getMethod("Data");
		info manno=m.getAnnotation(info.class);
		System.out.println("AuthorID: "+manno.AuthorID());  
		System.out.println("AuthorName: "+manno.Author());  
		System.out.println("Supervisor: "+manno.Supervisor());  
		System.out.println("Date: "+manno.Date());  
		System.out.println("Time: "+manno.Time());  
		System.out.println("Version: "+manno.version());  
	}

}
