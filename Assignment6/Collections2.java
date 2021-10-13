import java.util.HashSet;

class product{
	private int num;

	public product(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		return builder.toString();
	}
	
}
public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product[] p=new product[10];
		HashSet<Object> hs=new HashSet<Object>();
		p[0]=new product(1);
		p[1]=new product(1);
		p[2]=new product(2);
		p[3]=new product(2);
		p[4]=new product(3);
		p[5]=new product(3);
		p[6]=new product(3);
		p[7]=new product(3);
		p[8]=new product(3);
		p[9]=new product(3);
		hs.add(p[0]);
		hs.add(p[5]);
		hs.add(p[1]);
		hs.add(p[2]);
		hs.add(p[3]);
		hs.add(p[6]);
		hs.add(p[7]);
		hs.add(p[8]);
		hs.add(p[9]);
		hs.add(p[2]);
		hs.add(p[3]);
		hs.add(p[4]);
		System.out.println(hs.toString());
	}

}
