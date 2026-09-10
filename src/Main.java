import java.util.Scanner;

// ----------------- ATM Machine *

public class Main {

    public static void main(String[] args){

// vars

        boolean running = true;
        int Balance = 1000;

// Scanner Instance from object

Scanner scanner = new Scanner(System.in);

// program running

while(running){

    displayMenu();

    String userInput = scanner.nextLine();

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

}
