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

            deposit(Balance, userInput);
            break;
        case 3:

            withdraw(Balance, userInput);
            break;

        case 4:

            exit(running);
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

        System.out.println(balance);

    }

    public static void deposit(int balance, int amountToDeposit){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter amount to deposit: ");
        amountToDeposit = scanner.nextInt();

        balance += amountToDeposit;

    }

    public static void withdraw(int balance, int amount){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter amount to be withdrawn: ");

        scanner.nextLine(); // Clear the input buffer

        if(amount > balance){

            balance -= 15; // insufficient funds charge

            System.out.print("error: insufficient amount of funds\n" +
                             "$15 charge added to account");

        }else{

            balance -= amount;

            System.out.print("$" + amount + " successfully withdrawn\n");

        }

    }

    public static void exit(boolean running){

        running = false;

    }

}
