import java.util.*;
class Account{
    Scanner sc = new Scanner(System.in);
    String Accid;
    int Accno;
    private int amt;
        
    Account(){
        System.out.print("Enter the Account ID: ");
        Accid=sc.nextLine();
        System.out.print("Enter the Account No: ");
        Accno=sc.nextInt();
        System.out.print("Enter the Amount: ");
        amt=sc.nextInt();

    }
    void Deposit(int a){
        if(a>0){
        amt=amt + a;
    System.out.println("New Balance: "+amt);}
        else{
            System.out.println("Invalid Request");
        }
    }
    void Withdraw(int b){
        if(b<=amt){
            amt=amt-b;
            System.out.println("Withdrew: "+b);
        }
        else{
            System.out.println("Insufficient Amount");
        }
    }
    void Display(){
        System.out.println("Account ID: " + Accid);
        System.out.println("Account No: "+ Accno);
        System.out.println("Amount: " + amt);
    }

}
class Bank {
    public static void main(String[] args){
        Account a1= new Account();

        a1.Deposit(500);
        a1.Deposit(-100);
        a1.Withdraw(100000);


    }
    
}
