package main;
import banks.iobATM;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class main extends iobATM {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        main b1=new main();
        int res=1;

        do{

            System.out.println("Welcome To IOB ATM");
            System.out.println("Enter Your Pin");
            int pin = scan.nextInt();

            if (b1.verifyPin(pin)) {
                System.out.println("Welcome " + b1.getName());
                System.out.println("Press 1 for Deposition\nPress 2 for WithDrawl\n Press 3 To Check balance");
                byte a = scan.nextByte();
                switch (a) {
                    case 1:
                        System.out.println("Enter the Amount To Be Deposited");
                        double mny = scan.nextDouble();
                        b1.deposite(mny);
                        break;

                    case 2:
                        System.out.println("Enter the Amount To Be Deposited");
                        double wm = scan.nextDouble();
                        b1.withdraw(wm);
                        break;

                    case 3:
                        System.out.println("Enter the Amount To Be Deposited");
                        b1.showBalance();
                        break;

                    default:
                        System.out.println("Wrong Input");

                }

            }else {
            System.out.println("Invalid Pin"); }

            System.out.println("Do You  want to continue\nPress 1 to continue\n Press 0 to Exit");
            res=scan.nextInt();
        }while(res!=0);
    }
}

