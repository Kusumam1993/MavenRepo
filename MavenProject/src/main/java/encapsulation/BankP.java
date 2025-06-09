package encapsulation;

import java.util.Scanner;

public class BankP 
{
	
	    private int pin;

	    public void setPin(int pin)
	    {
	        this.pin = pin;
	        
	    }

	   /* public boolean validatePin(int userPin)
	    {
	        int validPins [] = {1001, 1234, 1212};
	        for (int valid : validPins)
	        {
	            if (userPin == valid) 
	            {
	                return true;
	            }
	        }
	        return false;
	    }*/
	    
	    public void validatePin(int userPin)
	    {
	    	if(pin==1001||pin==1234||pin==1212)
	    	{
	    		System.out.println("PIN validated. Proceed with withdrawal.");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid PIN. Access denied.");
	    	}
	    }
	}



