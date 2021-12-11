import java.io.*;

public class Pro1_laimic12 {

    //object to read user input at command line
    public static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws IOException {
    	
    	System.out.print("   JAVA FIZZBUZZ PROGRAM" + "\n");
    	
    	//variables
        int f, b, startNum, endNum;
        
        //initialize fizz number and buzz number
        f = b = -1;
        
        while (f != 0 && b != 0) {
	        //get the fizz number
        	System.out.print("Enter Fizz number: ");
	        f = Integer.parseInt(cin.readLine());
	        //a negative fizz number causes an error
	        while (f < 0) {
	        	System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
	            f = Integer.parseInt(cin.readLine());
	        }
	        //end the game if fizz number is zero
	        if (f == 0) {
	        	break;
	        }
	        
	        //get the buzz number
	        System.out.print("Enter Buzz number: ");
	        b = Integer.parseInt(cin.readLine());
	        //a negative buzz number causes an error
	        while (b < 0) {
	        	System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
	            b = Integer.parseInt(cin.readLine());
	        }
	        //end the game if buzz number is zero
	        if (b == 0) {
	        	break;
	        }
	        
	        //get the starting number
	        System.out.print("Enter starting number: ");
	        startNum = Integer.parseInt(cin.readLine());
	        //get the ending number
	        System.out.print("Enter ending number: ");
	        endNum = Integer.parseInt(cin.readLine());
	        //an ending number that is less than the starting number causes an error
	        while (endNum < startNum) {
		        System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
	            endNum = Integer.parseInt(cin.readLine());
	        }
	            
	        System.out.print("\n");
	        
            //print the results according to fizzbuzz game rules
	        for (int i = startNum; i <= endNum; i++) {
	            if (i % f == 0 && i % b == 0) {
	            	System.out.print(i + ". FizzBuzz" + "\n" + "");
	            }
	            else if (i % f == 0) {
	            	System.out.print(i + ". Fizz" + "\n" + "");
	            }
	            
	            else if (i % b == 0) {
	            	System.out.print(i + ". Buzz" + "\n" + "");
	            }

	            else {
	            	System.out.print(i + ". " + i + "\n" + "");
	            }
	        }
	        System.out.print("\n" + "   JAVA FIZZBUZZ PROGRAM\n" + "");
		    continue;    
        }
        
        //the games ends if fizz number or buzz number is zero
    	System.out.print("\n" + "The end.\n" + "");
    }
	
}
