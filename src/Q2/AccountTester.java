package Q2;
/**
 * Organization: Yamaha Motor Solutions India
 * Project Name:LabTest1
 * Package: Q2
 * Class: AccountTester
 * Description: Implement the UML given
 * Created On:05 August 2021
 * @author Ananya Srivastava
 */

//class Account, base class for SavingAccount and CurrentAccount
class Account{
	private Owner owner;
	private float balance;
	private String number;
	
	//default constructor
	public Account() {
		
	}
	
	//parameterized constructor
	public Account(Owner owner,  String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}
	
	//copy constructor
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}
	
	//input() method
	public void input() {
	}
	
	//print out the object
	public void print() {
		System.out.println(this);
	}
	
	//deposit amount into Account
	public void deposit() {
		
	}
	//withdraw amount from Account
	public void withdraw() {
		
	}
	
	//getter for balance
	public float getBalance() {
		return balance;
	}

	//overriding toString() method
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
}

//class Owner, which is a composite object in Account
class Owner{
	private String name;
	private Date dob;
	private String nic;
	
	//default constructor
	public Owner() {
		
	}
	
	//parameterized constructor
	public Owner(String name, String nic, Date dob) {
		this.name = name;
		this.dob = dob;
		this.nic = nic;
	}
	
	//copy constructor
	public Owner(Owner owner) {
		this.name = owner.name;
		this.dob = owner.dob;
		this.nic = owner.nic;
	}
	
	//input() method
	public void input() {
	}
	
	//print out the object
	public void print() {
		System.out.println(this);
	}
	
	//overriding toString() method
	@Override
	public String toString() {
		return "Owner name=" + name + ", dob=" + dob + ", nic=" + nic;
	}
}
class Date{
	private int day;
	private int month;
	private int year;
	
	//default constructor
	public Date(){ }
	
	//parameterized constructor
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//input() method
	public void input() {
	}
	
	//print out the object
	public void print() {
		System.out.println(this);
	}
	
	//overriding toString() method
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	//copy constructor
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.month;
	}
}

class SavingAccount extends Account{
	private float interestRate;
	
	//default constructor
	public SavingAccount() {
		
	}
	
	//copy constructor
public SavingAccount(SavingAccount savingAccount) {
		this.interestRate = savingAccount.interestRate;
	}
//override input() method
@Override
public void input() {
}

//override print out the object
@Override
public void print() {
	System.out.println(this);
}

//overriding toString() method
@Override
public String toString() {
	return "SavingAccount [interestRate=" + interestRate + "]";
}

//getter for interestRate
public float getInterestRate() {
	return interestRate;
}
}

class CurrentAccount extends Account{
	private float minimumBalance;
	
	//default constructor
	public CurrentAccount() {
		
	}
	
	//copy constructor
	public CurrentAccount(CurrentAccount currentAccount) {
		this.minimumBalance = currentAccount.minimumBalance;
	}

//override input() method
@Override
public void input() {
}

//override and print out the object
@Override
public void print() {
	System.out.println(this);
}

//overriding toString() method
@Override
public String toString() {
	return "CurrentAccount [minimumBalance=" + minimumBalance + "]";
}

//getter for minimumBalance
public float getCharges() {
	return minimumBalance;
}
}

//tester class
public class AccountTester {
	//tester method
	public static void main(String[] args) {
		
	}//end-of-main
}//end-of-class
