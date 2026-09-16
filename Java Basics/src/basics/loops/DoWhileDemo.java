package basics.loops;

import java.util.Scanner;

public class DoWhileDemo {
    static void main(String[] args) {
        // control flow for repeating the execution of a group of statement
        double balance = 0;
        double minBal = 500;
        double depositAmt = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the amount to be deposit");
            depositAmt = sc.nextInt();
        }while(depositAmt<minBal);
        balance = depositAmt;
        System.out.println("Your deposit was successful");
    }
}
