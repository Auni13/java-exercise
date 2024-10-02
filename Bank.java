import java.util.Scanner;

public class Bank{
    private double currentBalance = 3500.50; 
    private double amountDeposit;
    private double amountWithdraw;

    Scanner scanner = new Scanner(System.in);

    public int menu(){
        
        System.out.println("----------- Welcome ----------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Please choose the option (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        return choice;
    }

    public void checkBalance(){ 
        System.out.print("The balance of your account is RM " + currentBalance);
        System.out.println();
        
    }

    public void depositMoney(){
        System.out.print("Enter the amount you want to deposit: ");
        double amountDeposit = scanner.nextDouble();
        currentBalance += amountDeposit;
        System.out.println("New current balance is RM " + currentBalance);
        System.out.println();
    }

    public void withdrawMoney(){
        System.out.println("Enter the amount you want to withdraw: ");
        double amountWithdraw = scanner.nextDouble();

        if (amountWithdraw <= currentBalance){
            currentBalance -= amountWithdraw;
            System.out.println("Withdrawal Successfull. New balance: RM " + currentBalance);
        }else {
            System.out.println("Sorry, insuficient funds");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        int choice;

        do{
            choice = bank.menu();

            switch (choice) {
                case 1:
                bank.checkBalance();
                break;

                case 2:
                bank.depositMoney();
                break;

                case 3:
                bank.withdrawMoney();
                break;

                case 4:
                System.out.println("Exited. Thank You for using Our Services");
                break;

                default:
                System.out.println("Invalid choice. Please choose again");
                System.out.println();
                //bank.menu();
                break;
            }
        }while(choice != 4);
    }
}