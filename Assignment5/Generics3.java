class Generics<T>{
	private T[] arr;
	public T[] getArr() {
		return arr;
	}
	public void setArr(T[] arr) {
		this.arr=arr;
	}
	public Generics(T[] arr) {
		super();
		this.arr=arr;
	}
	public<E>void Exchange(E[] arr) {
		System.out.println("Elements to be exchanged are "+ arr[0]+" "+arr[1]);
		E temp=(E) arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("After exchanging:"+arr[0]+" "+arr[1]);
	}
}
public class Generics3 {

	public static void main(String[] args) {
		Integer arr[]= {20,30};
		Generics<Integer> e = new Generics<Integer>(arr);
		e.Exchange(arr);
	}
}








