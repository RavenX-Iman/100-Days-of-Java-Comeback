package Day_1.Oops;



public class BankAccount {
   int accountNumber;
   String holderName;
   double balance;
     BankAccount(int aNo, String hName, double b){
        accountNumber= aNo;
        holderName= hName;
        balance= b;

     }
 public void displayInfo(){
    System.out.println("Holder name:"+ holderName);
    System.out.println("Account no:"+ accountNumber);
    System.out.println("Balance:"+ balance);
 }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123, "alex", 2700);
        b1.displayInfo();
    
    }
}
