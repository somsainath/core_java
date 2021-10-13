		import java.util.*;
		public class CheckSingleton {
			static CheckSingleton obj = new CheckSingleton();
			private CheckSingleton() 
			{
				
			}
			public static CheckSingleton getobj()
			{
				return obj;
				
			}
			
		}
		class Subclass extends CheckSingleton
		{
			public static void main(String[] args)
			{
			Subclass act= new Subclass();
			act.getobj();
			}
			
		}