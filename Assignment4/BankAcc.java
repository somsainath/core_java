import java.util.Scanner;
		class insuficientBalanceException extends Exception {
			
		}
		class IllegalBankTransactionException extends Exception {
			
		}
		class Savings
		{
			double balance;
			Savings(double balance){
				this.balance=balance;
			}
			public double withdraw(double amt)
			{
			try
			{
				if(balance==0 || amt>balance) 
				{
					throw new insuficientBalanceException();
				}
				else if(amt<0) {
					throw new IllegalBankTransactionException();
				}
				else 
				{
					balance=balance-amt;
					System.out.println("Balance Amount:Rs." + balance );
				}
			}
			catch(insuficientBalanceException e)
			{
				System.out.println("Insuficient funds!.check balance.");
				e.printStackTrace();
			}
			catch(IllegalBankTransactionException e)
			{
				System.out.println("Amount should not be <0.");
				e.printStackTrace();
			}
				return amt;	
			}
			public double Deposit(double amt)
			{
				balance+=amt;
				return balance;
			}
			
		}
public class BankAcc {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the Employee ID: ");
				long id=sc.nextInt();
				Savings s=new Savings(100000.0);
				System.out.print("Enter 1 to withdraw and 2 to deposit: ");
				int op=sc.nextInt();
				if(op==1) 
				{
					System.out.print("Enter the amount to withdraw");
					int t=sc.nextInt();
					s.withdraw(t);
				}
				else if(op==2) {
					System.out.print("Enter the amount to deposit :Rs.");
					double amt=sc.nextDouble();
					System.out.println("Total amount in the Account is Rs."+s.Deposit(amt));
				}
				else {
					System.out.println("choose the correct option.");
				}
			}

		}