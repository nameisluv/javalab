import java.util.*;

class account {
	int accNo;
	String name = new String();
	long phoneNo;
	float balance;
	Scanner sc = new Scanner(System.in);
	void getinput() {
		System.out.println("Enter the account number: ");
		accNo = sc.nextInt();
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the phone number: ");
		phoneNo = sc.nextLong();
		System.out.println("Enter the account balance: ");
		balance = sc.nextFloat();
	}

	void deposit() {
		int depo;
		System.out.println("Enter the amount you want to deposit: ");
		depo = sc.nextInt();
		balance += depo;
	}

	void withdraw() {
		int cash;
		System.out.println("Enter the amount you want to withdraw: ");
		cash = sc.nextInt();
		balance -= cash;
	}

	void display() {
		System.out.println("Enter the account number: " + accNo);
		System.out.println("Enter the name: " + name);
		System.out.println("Enter the phone number: " + phoneNo);
		System.out.println("Enter the account balance: " + balance);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		account obj = new account();
		int n;
		for (;;) {
			System.out.println("Menu\n1: Input\n2: Deposit\n3: Withdraw\n4: Display\n5: Exit");
			n = scan.nextInt();
			switch (n) {
			case 1:
				obj.getinput();
				break;
			case 2:
				obj.deposit();
				break;
			case 3:
				obj.withdraw();
				break;
			case 4:
				obj.display();
				break;
			case 5:
				System.exit(0);
			default:
				break;

			}
		}
	}
}