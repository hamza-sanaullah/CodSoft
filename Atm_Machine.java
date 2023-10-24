//.................<IMPORTING SCANNER CLASS>.................
import java.util.Scanner;
//.................<CREATING BANK ACCOUNT CLASS>..............
class Bank_Account{
    private String accountholder;

    private int accountnumber;
    private double balance;
//..................<MAKING GETTERS OF PRIVATE ATTRIBUTES>........................
    public String getAccountholder() {
        return accountholder;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }
//................<MAKING PARAMETRIZED CONSTRUCTOR>....................................
    public Bank_Account(String accountholder, int accountnumber , double balance){
        this.accountholder = accountholder;
        this.accountnumber = accountnumber;
        this.balance = balance;

    }

}
//...............<CREATING ATM CLASS>.....................
class Atmmachine{
//    CREATING OBJECT OF BANK_ACCOUNT CLASS
    Bank_Account bank = new Bank_Account("Hamza",7456,10000);
//    GETTING THE INITIAL BALANCE OF BANK ACCOUNT
    double balnce = bank.getBalance();
    

    //    GETTING THE ACCOUNTHOLDER NAME OF BANK ACCOUNT
    int acc = bank.getAccountnumber();
    String str = bank.getAccountholder();
    private void checkBalance(){
        System.out.println("your current baalnce is "+ balnce);
    }
    public String status(){
        checkBalance();
        String retun = "";
        if (balnce!=0){
            retun = ("Your account have sufficient balance");
        }
     return retun;
    }


    public int withdrawmoney(){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter your ATM card number");
//        int card = scanner.nextInt();
//        System.out.println("Please Enter the Pin For The Card");
//        int pin = scanner.nextInt();
        System.out.println("HOW MUCH MONEY YOU WANT TO WITHDRAW FROM YOUR ACCOUNT :");
        int money = scanner.nextInt();
        if (money>0 && balnce!=0){
            balnce-=money;
            System.out.println("Withdrawal Successfull!!!");
        }
        else {
            System.out.println("OOPS! Your Balance is insufficient for this withdrawal");
        }


        return money;
    }
    public String  depositmoney(){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Give your Account Number");
//        int account = scanner.nextInt();
        System.out.println("Please Enter the money you want to deposit");
        int dep = scanner.nextInt();
        if (dep==0){
            System.out.println("Please Enter Sufficient Money to deposit in your account");
        }else {
            balnce+=dep;
            System.out.println("Deposit Successful!! Your current balance is " + balnce);
        }
        String retun = "Your money  Has Been Deposited In your Account";
        return retun;

    }
    public void ui(){
        System.out.println("                --------------------------------------------");

        System.out.println("                        WELCOME TO MY BANK ATM             ");
        System.out.println("                --------------------------------------------");
        System.out.println("Please select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("           ");
        System.out.println("                --------------------------------------------");


        }
    }






public class Atm_Machine {
    public static void main(String[] args) {
        Atmmachine atm = new Atmmachine();
        atm.ui();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        switch (choice){
            case(1):
                atm.withdrawmoney();
                break;

            case(2):
                atm.depositmoney();
                break;
            case(3):
                atm.status();
                break;
            case 4: // Exit option
                System.out.println("Exiting the program.");
                System.exit(0);
                break;







        }




    }
}
