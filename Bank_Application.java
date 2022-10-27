package Banking_Application;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Backend {
	Scanner sc = new Scanner(System.in);
	static int x; 

	public void homepage() {
		x = sc.nextInt();
		Bank_Application obj = new Bank_Application();
		try {
			if (x == 1) { // Create a New Account
				obj.Create_new_Account();
			} else if (x == 2) {// Withdrawal
				obj.Withdrawal();
			} else if (x == 3) {// Deposit
				obj.Deposit();
			} else if (x == 4) {// To get a specific Account Detail
				obj.Search_Specfic_Account();
			} else if (x == 5) { // Exit
				obj.Exit();

			} else {
				System.out.println("Enter a valid Input");
				System.out.println("***************************************");
			}

		} catch (Exception E) {
			System.out.println(E);
			E.printStackTrace();
		}

	}

}

public class Bank_Application extends Backend {

	static int balance = 0;

	public void Features() {
		System.out.println("         S ------>Bank (Banking Application)              ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("----> Enter a number too unlock a following Feature <----");
		System.out.println("1 --> Create a New Account              <<<<");
		System.out.println("2 --> Withdrawal                        <<<<");
		System.out.println("3 --> Deposit                           <<<<");
		System.out.println("4 --> To get a specific Account Detail  <<<<");
		System.out.println("5 --> Exit                              <<<<");
	}

	public void Create_new_Account() throws SQLException, ClassNotFoundException, InputMismatchException, Exception {

		String Holders_Name;
		System.out.println("Enter the Holder's Name");
		Holders_Name = sc.next();

		String Account_Type;
		System.out.println("Select the type of your Account");
		Account_Type = sc.next();

		int Security_Code;
		System.out.println("Enter your Security code");
		Security_Code = sc.nextInt();

		long Phn_Number;
		System.out.println("Enter the users Phone Number");
		Phn_Number = sc.nextLong();

		int Acc_Balance;
		System.out.println("Deposit the minimum amount of 1000 rupees");
		Acc_Balance = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_acc_list", "root", "Sriram@123");

		Statement S = C.createStatement();

		String Query = "INSERT into `bank_acc_list`.`bank_database`(`Holders_Name`,`Account_Type`,`Phn_Number`,`Security_Code`,`Acc_Balance`)"
				+ " values('" + Holders_Name + "','" + Account_Type + "','" + Phn_Number + "','" + Security_Code + "','"
				+ Acc_Balance + "');";

		S.executeUpdate(Query);
		System.out.println("Your Account is created Successfully");
	}

	public void Withdrawal() throws SQLException, ClassNotFoundException, InputMismatchException, Exception {

		int Amt_Withdraw;
		System.out.println("Enter the amount you want to withdraw: ");
		Amt_Withdraw = sc.nextInt();

		int Security_Code;
		System.out.println("Enter your Security code");
		Security_Code = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_acc_list", "root", "Sriram@123");

		Statement S = C.createStatement();

		String Query = "update bank_database set Acc_Balance =  Acc_Balance - " + Amt_Withdraw
				+ "  where Security_Code = " + Security_Code + ";";

		S.executeUpdate(Query);

		System.out.println("***Amount Withdrawed Successfully***");

		System.out.println("***************************************");

	}

	public void Deposit() throws SQLException, ClassNotFoundException, InputMismatchException, Exception {
		int amt_deposit;
		System.out.println("Enter the amount you want to deposit: ");
		amt_deposit = sc.nextInt();

		int Security_Code;
		System.out.println("Enter your Security code");
		Security_Code = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_acc_list", "root", "Sriram@123");

		Statement S = C.createStatement();

		String Query = "update bank_database set Acc_Balance =  Acc_Balance + " + amt_deposit
				+ "  where Security_Code = " + Security_Code + ";";

		S.executeUpdate(Query);

		System.out.println("Your Amount is Deposited Successfully");

		// System.out.println(" Your current balance" + R.getString("Acc_Balance"));

		System.out.println("***************************************");
	}

	public void Search_Specfic_Account() throws SQLException, ClassNotFoundException, Exception {

		String Holders_Name;
		System.out.println("Enter the Holder Name :  ");
		Holders_Name = sc.next();

		int Security_Code = 0;
		System.out.println("Enter your Security code : ");
		Security_Code = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_acc_list", "root", "Sriram@123");

		Statement S = C.createStatement();

		String Query = "SELECT * From `bank_acc_list`.`bank_database` where Holders_Name = '" + Holders_Name
				+ "' or Security_Code = '" + Security_Code + "';";

		ResultSet R = S.executeQuery(Query);

		while (R.next()) {

			System.out.println("Holders Names     : " + R.getString("Holders_Name"));
			System.out.println("Account Number    : " + R.getString("Account_Number"));
			System.out.println("Account Type      : " + R.getString("Account_Type"));
			System.out.println("Phone Number      : " + R.getString("Phn_Number"));
			System.out.println("Current Balance   : " + R.getString("Acc_Balance"));

		}

		System.out.println("________________________________________________________________________");
	}

	public void Exit() {
		System.out.println("Exited Successfully");
		System.out.println("**************************************");

	}

	public void callmeths() {
		Bank_Application obj = new Bank_Application();
		obj.Features();
		obj.homepage();
	}

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, InputMismatchException, Exception {

		Bank_Application O = new Bank_Application();
		O.callmeths();

	}

}
