import java.util.Scanner;
public class UnsupportedopException {
   public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter two numbers");
				try {
					int n1=sc.nextInt();
					int n2=sc.nextInt();
					if(n2==0)
						throw new UnsupportedOperationException("Unsupported Operation Exception");
					else {
					int result=n1/n2;
					System.out.println("Result:"+result);
					}
				}
				catch(UnsupportedOperationException e) {
					System.out.print(e);
				}
			}
}
