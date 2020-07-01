import java.util.Scanner;

public class Bank {;
	int balance;
	int withdraw;
	int deposit;
	String Cname;
	int id;
	int previoustransaction;
	Bank(String name,int id){
		Cname=name;
		this.id=id;
		System.out.println("Hello " +name +". Your id is: " +id);
	}
	void deposit(int amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("You deposited "+amount);
			previoustransaction = amount;
			System.out.println("------------------------------------------");
		}
	}
	void withdraw(int amount) {
		if(amount<0) {
			balance= balance-amount;
			System.out.println("You withdrawn " +amount);
			previoustransaction = -amount;
			System.out.println("------------------------------------------");

		}
	}
	void PreviousTransaction() {
		if(previoustransaction>0) {
			System.out.println("You deposited " +previoustransaction);
			System.out.println("------------------------------------------");
		}
		else if(previoustransaction<0) {
			System.out.println("You withdrawn " +Math.abs(previoustransaction));
			System.out.println("------------------------------------------");
		}
		else {
			System.out.println("No transaction yet!");
		}
	}
	void Intro(){
		
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("A.check balance");
		System.out.println("B.deposit");
		System.out.println("C.withdraw");
		System.out.println("D.pervious transaction");
		System.out.println("E.exit");
		System.out.println("What would you like to do?");	
	
	do
	{
		System.out.println("Enter an option:");
		
		option = sc.next().charAt(0);
		
		switch(option) {
		case 'A':
			
			System.out.println("Your current balance is " +balance);
			System.out.println("------------------------------------------");
			break;
		case 'B':
			
			System.out.println("Enter the amount to deposit");
			int a= sc.nextInt();
			deposit(a);
			break;
		case 'C':
			
			System.out.println("Enter the amount to withdraw");
			int b= sc.nextInt();
			withdraw(b);
			break;
		case 'D':
			
			PreviousTransaction();
		}
	}	
	while(option !='E'); {
		System.out.println("Thank you for using our service");
	}	

		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name= sc.next();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		Bank b= new Bank(name, id);
		b.Intro();

	}
}
