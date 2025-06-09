package encapsulation;

import java.util.Scanner;

public class User
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        BankP bank = new BankP();

        System.out.print("Enter your PIN: ");
        int userPin = sc.nextInt();
        bank.setPin(userPin);
        bank.validatePin(userPin);

       
    }
	}


