import java.util.*;

public class atm {
    public static void main(String args[]) {
        InnerATm obj = new InnerATm();
        obj.checkPin();
    }
}

class InnerATm {

    static double balance = 0.0;
    static int PIN = 5555;

    public void checkPin() {
        System.out.println("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int Pin = sc.nextInt();
        if (PIN == Pin) {
            menu();
        } else {
            System.out.println("Invalid PIN Entered");
            checkPin();
        }
        
    }
  
    public static void printThankyou() {
        System.out.println("ThankYou ");
    }

    public static void menu(){
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        

        if(option==1){
            checkBalance();
        }else if(option==2){
            depositMoney();
        }
        else if(option==3){
            withdrawMoney();
        }
        else if(option==4){
            printThankyou();
            return;
        }else{
            System.out.println("Enter a valid Choice");
        }
    }

    public static void checkBalance(){
        System.out.println("Current Balance : "+balance);
        menu();
    }

    public static void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount You Want to Deposit : ");
        double depositeVal = sc.nextDouble();
        if (depositeVal <= 0.0) {
            System.out.println("Please Enter a valid Deposite Amount!");
            
        } else {
            balance += depositeVal;
            System.out.println("Your Current Balance is: " + balance); 
        }
        
        menu();
    }

    public static void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount To Withdraw : ");
        double withVal = sc.nextDouble();
        if(withVal<=0){
            System.out.println("Enter a valid Amount to Withdraw");
        }
        else if(withVal>balance){
            System.out.println("Insufficient Balance");
            
        }else{
            balance=balance-withVal;
            System.out.println("Money Withdrawal Successfully");  
        }
        
        menu();
    }   
}

