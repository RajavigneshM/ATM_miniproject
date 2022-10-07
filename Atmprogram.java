package demo;

import java.util.*;

public class Atmprogram {
  public static void main(String[] args) {
	  Accountdetails a1 = new Accountdetails(101,"Suresh",2343,0);
	  Accountdetails a2 = new Accountdetails(102,"Ganesh",5432,0);
	  Accountdetails a3 = new Accountdetails(103,"Magesh",7854,0);
	  Accountdetails a4 = new Accountdetails(104,"Naresh",2345,0);
	  Accountdetails a5 = new Accountdetails(105,"Harish",1907,0);
	 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Choice: ");
	  System.out.println("1.Deposit  2.Withdraw  3.Check Balance  4.Transfer Money 5.Display Account Holder details");
	  
	  int choice=sc.nextInt();
	  int acnumber,twothous,fivehun,hun,sumamnt,withdrawamnt,racnumber,pinno;
	  
	  switch(choice) {
	  case 1:
		 System.out.println("Enter your Account Number");
		 acnumber = sc.nextInt();
		 System.out.println("Enter your Pin Number");
		 pinno = sc.nextInt();
		 System.out.println("Enter Number of 2000");
		 twothous = sc.nextInt();
		 System.out.println("Enter Number of 500");
		 fivehun = sc.nextInt();
		 System.out.println("Enter Number of 100");
		 hun = sc.nextInt();
	     sumamnt=((2000*twothous)+(500*fivehun)+(100*hun));
	     if(pinno==a1.pin) {
	    	 a1.setbalance(a1.getbalance()+sumamnt);
	     }else if(pinno==a2.pin) {
	    	 a2.setbalance(a2.getbalance()+sumamnt);
	     }else if(pinno==a3.pin) {
	    	 a3.setbalance(a3.getbalance()+sumamnt);
	     }else if(pinno==a4.pin) {
	    	 a4.setbalance(a4.getbalance()+sumamnt);
	     }else{
	    	 a5.setbalance(a5.getbalance()+sumamnt);
	     }
	     System.out.print(a4.balance+" Deposited Successfully");
	    break;
	  case 2:
		     System.out.println("Enter your Account Number");
			 acnumber = sc.nextInt();
			 System.out.println("Enter the Amount to be withdrawn");
		     withdrawamnt = sc.nextInt();
		     System.out.println("Enter your Pin Number");
			 pinno = sc.nextInt();
		     if(pinno==a1.pin) {
		    	 a1.setbalance(a1.getbalance()-withdrawamnt);
		     }else if(pinno==a2.pin) {
		    	 a2.setbalance(a2.getbalance()-withdrawamnt);
		     }else if(pinno==a3.pin) {
		    	 a3.setbalance(a3.getbalance()-withdrawamnt);
		     }else if(pinno==a4.pin) {
		    	 a4.setbalance(a4.getbalance()-withdrawamnt);
		     }else{
		    	 a5.setbalance(a5.getbalance()-withdrawamnt);
		     }
		     System.out.print("Withdrawn Successfully");
		    break;
	  case 3:
		  System.out.println("Enter your Account Number");
		  acnumber = sc.nextInt();
		  System.out.println("Enter your Pin Number");
			 pinno = sc.nextInt();
		  if(pinno==a1.pin) {
		    	 a1.setbalance(a1.getbalance());
		     }else if(pinno==a2.pin) {
		    	 a2.setbalance(a2.getbalance());
		     }else if(pinno==a3.pin) {
		    	 a3.setbalance(a3.getbalance());
		     }else if(pinno==a4.pin) {
		    	 a4.setbalance(a4.getbalance());
		     }else{
		    	 a5.setbalance(a5.getbalance());
		     }
		break;
	  case 4:
		  System.out.println("Enter your Account Number");
			 acnumber = sc.nextInt();
			 System.out.println("Enter your Pin Number");
			 pinno = sc.nextInt();
			 System.out.println("Enter the receiver's Account Number");
			 racnumber = sc.nextInt();
			 System.out.println("Your Balance is Insufficient for Transferring money, Please Deposit");
			 System.out.println("Enter Number of 2000");
			 twothous = sc.nextInt();
			 System.out.println("Enter Number of 500");
			 fivehun = sc.nextInt();
			 System.out.println("Enter Number of 100");
			 hun = sc.nextInt();
		     sumamnt=((2000*twothous)+(500*fivehun)+(100*hun));
		     if(racnumber==a1.acno) {
		    	 a1.setbalance(a1.getbalance()+sumamnt);
		    	 System.out.println("Transaction done successfully, "+sumamnt+" depicted from your account");
		     }else if(racnumber==a2.acno) {
		    	 a2.setbalance(a2.getbalance()+sumamnt);
		    	 System.out.println("Transaction done successfully, "+sumamnt+" depicted from your account");
		     }else if(racnumber==a3.acno) {
		    	 a3.setbalance(a3.getbalance()+sumamnt);
		    	 System.out.println("Transaction done successfully, "+sumamnt+" depicted from your account");
		     }else if(racnumber==a4.acno) {
		    	 a4.setbalance(a4.getbalance()+sumamnt);
		    	 System.out.println("Transaction done successfully, "+sumamnt+" depicted from your account");
		     }else{
		    	 a5.setbalance(a5.getbalance()+sumamnt);
		    	 System.out.println("Transaction done successfully, "+sumamnt+" depicted from your account");
		     }   
	    break;
	  case 5:
		  System.out.println("Enter your Account Number");
			 acnumber = sc.nextInt();
			 System.out.println("Enter your Pin Number");
			 pinno = sc.nextInt();
			 if(pinno==a1.pin) {
		    	System.out.println("Name: "+a1.acname+" Balance: "+a1.balance);
		     }else if(pinno==a2.pin) {
		    	 System.out.println("Name: "+a2.acname+" Balance: "+a2.balance);
		     }else if(pinno==a3.pin) {
		    	 System.out.println("Name: "+a3.acname+" Balance: "+a3.balance);
		     }else if(pinno==a4.pin) {
		    	 System.out.println("Name: "+a4.acname+" Balance: "+a4.balance);
		     }else{
		    	 System.out.println("Name: "+a5.acname+" Balance: "+a5.balance);
		     }
	    break;
	  default:
		  System.out.println("Enter Correct Choice!");
	    
	}
	 
  }


	
}


