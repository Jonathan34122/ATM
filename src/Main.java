import java.util.Scanner;

// ----------------- ATM Machine *

public class Main {

    public static void main(String[] args){

// main's vars

        boolean running = true;
        int Balance = 1000;

// Scanner Instance from object

Scanner scanner = new Scanner(System.in);

// program running

while(running){

    displayMenu();

    int userInput = scanner.nextInt();

    switch(userInput){

        case 1:

            getBalance(Balance);
            break;
        case 2:

            Balance = deposit(Balance, scanner);
            break;
        case 3:

            Balance = withdraw(Balance, userInput);
            break;

        case 4:

            running = exit();
    }

}



    }
// ----------------- Methods
    public static void displayMenu(){

        System.out.print("~~~~~~~~~~ ATM ~~~~~~~~~~\n" +
                         "1. Check My Balance\n" +
                         "2. Make a Deposit\n" +
                         "3. Withdraw my Funds\n" +
                         "4. Exit\n");

    }

    public static void getBalance(int balance){

        System.out.println("$" + balance);

    }

    public static int deposit(int balance, Scanner scanner){

        System.out.print("enter amount to deposit: ");
        int amountToDeposit = scanner.nextInt();

        balance += amountToDeposit;

        return balance;

    }

    public static int withdraw(int balance, int amount){

        System.out.print("enter amount to be withdrawn: ");

        Scanner scanner = new Scanner(System.in);

        amount = scanner.nextInt();

        if(amount > balance){

            System.out.print("error: insufficient amount of funds, transaction cancelled\n" +
                    "$15 charge added to account\n");

            return balance -= 15; // insufficient funds charge

        }else{

            System.out.print("\n$" + amount + " successfully withdrawn\n");

            return balance -= amount;

        }

    }

    public static boolean exit(){

        return false;

    }

}
