package tns.Casestudy;
import java.util.*;
import java.util.Scanner;

public class BankingSystemApp {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);{
		 BankingService service = new BankingServiceImpl();
		 while (true) {
		 System.out.println("\nBanking System");
		 System.out.println("1. Add Customer");
		 System.out.println("2. Add Account");
		 System.out.println("3. Add Beneficiary");
		 System.out.println("4. Add Transaction");
		 System.out.println("5. Find Customer by Id");
		 System.out.println("6. List all Accounts of a Customer");
		 System.out.println("7. List all Transactions of an Account");
		 System.out.println("8. List all Beneficiaries of a Customer");
		 System.out.println("9. Exit");
		 System.out.print("Enter your choice: ");
		 int choice = sc.nextInt();
		 switch (choice) {
		 case 1:
		 System.out.print("Enter Customer ID: ");
		 int cid = sc.nextInt();
		 sc.nextLine();
		 System.out.print("Name: ");
		 String name = sc.nextLine();
		 System.out.print("Address: ");
		 String address = sc.nextLine();
		 System.out.print("Contact: ");
		 String contact = sc.nextLine();
		 service.addCustomer(new Customer(cid, name, address, contact));
		 break;
		 case 2:
			 System.out.print("Enter Account ID: ");
			 int aid = sc.nextInt();
			 System.out.print("Customer ID: ");
			 int custId = sc.nextInt();
			 sc.nextLine();
			 System.out.print("Account Type: ");
			 String type = sc.nextLine();
			 System.out.print("Balance: ");
			 double bal = sc.nextDouble();
			 service.addAccount(new Account(aid, custId, type, bal));
			 break;
			 case 3:
			 System.out.print("Enter Beneficiary ID: ");
			 int bid = sc.nextInt();
			 System.out.print("Customer ID: ");
			 int bcid = sc.nextInt();
			 sc.nextLine();
			 System.out.print("Name: ");
			 String bname = sc.nextLine();
			 System.out.print("Account Number: ");
			 String accNo = sc.nextLine();
			 System.out.print("Bank Details: ");
			 String bank = sc.nextLine();
			 service.addBeneficiary(new Beneficiary(bid, bcid, bname, accNo, bank));
			 break;
			 case 4:
			 System.out.print("Enter Account ID: ");
			 int transAccId = sc.nextInt();
			 sc.nextLine();
			 System.out.print("Type (Deposit/Withdrawal): ");
			 String transType = sc.nextLine();
			 System.out.print("Amount: ");
			 double amt = sc.nextDouble();
			 service.addTransaction(new Transaction(transAccId, transType, amt));
			 break;
			 case 5:
			 System.out.print("Enter Customer ID: ");
			 int findCid = sc.nextInt();
			 System.out.println(service.findCustomerById(findCid));
			 break;
			 case 6:
			 System.out.print("Enter Customer ID: ");
			 int listAccCid = sc.nextInt();
			 List<Account> accList = service.getAccountsByCustomerId(listAccCid);
			 accList.forEach(System.out::println);
			 break;
			 case 7:
				 System.out.print("Enter Account ID: ");
				 int listTransAid = sc.nextInt();
				 List<Transaction> transList = service.getTransactionsByAccountId(listTransAid);
				 transList.forEach(System.out::println);
				 break;
				 case 8:
				 System.out.print("Enter Customer ID: ");
				 int listBenCid = sc.nextInt();
				 List<Beneficiary> benList = service.getBeneficiariesByCustomerId(listBenCid);
				 benList.forEach(System.out::println);
				 break;
				 case 9:
				 System.out.println("Thank you!");
				 System.exit(0);
				 }
				 }
				 }
	}}
				
		 
		 


	

