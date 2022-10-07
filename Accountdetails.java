package demo;

public class Accountdetails {
   public int acno;
   public String acname;
   public int pin;
   public int balance;
   
   Accountdetails(int acno,String acname,int pin,int balance){
	   this.acno=acno;
	   this.acname=acname;
	   this.pin=pin;
	   this.balance=balance;
   }
   
   public void setacno(int acno) {
	   this.acno=acno;
   }
   public void setacname(String acname) {
	   this.acname=acname;
   }
   public void setpin(int pin) {
	   this.pin=pin;
   }
   public void setbalance(int balance) {
	   this.balance=balance;
   }
   
   public int getbalance() {
	   return balance;
   }
}
