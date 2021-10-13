import java.util.Date;
import java.util.HashMap;

class pair<key,value>{
	private String key;
	private String value;
	private Date date;
	pair(){}
	public pair(String key, String value) {
		super();
		this.setKey(key);
		this.value = value;
	}
	
	public pair(String key, Date date) {
		super();
		this.key = key;
		this.date = date;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
public class Generics4 {

	public static void main(String args[]) {
		pair<String,String> p=new pair<String,String>("1","Hello");
		HashMap<String,String> h=new HashMap<String,String>();
		pair<String,Date> p1=new pair<String,Date>("Today is ",new java.util.Date());
		h.put(p.getKey(),p.getValue());
		System.out.println(h);
		HashMap<String,String h1=new HashMap<String,String>();
		h1.put(p1.getKey(),p1.getValue());
		System.out.println(h1);
	}
}
