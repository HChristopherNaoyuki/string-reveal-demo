package Solutions;

import java.util.concurrent.TimeUnit;

public class RevealString 
{
    public static void main(String[] args) 
    {
        // Define the string to be revealed
        String myString = "Hello World!";
        
        // Get the length of the string
        int length = myString.length();

        // Print the initial message indicating the start of the process
        System.out.println("Initiating... \n");

        // Pause for dramatic effect
        try 
        {
            TimeUnit.SECONDS.sleep(1);  // Wait for 1 second
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();  // Print the stack trace if interrupted
        }

        // Print progressively longer substrings of the string
        for (int i = 0; i < length; i++) 
        {
            // Extract the substring from the start to the current index
            String substring = myString.substring(0, i + 1);
            
            // Overwrite the current line in the console
            System.out.print("\r" + substring);
            System.out.flush();  // Ensure the output is printed immediately
            
            // Pause for dramatic effect
            try 
            {
                TimeUnit.MILLISECONDS.sleep(500);  // Wait for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();  // Print the stack trace if interrupted
            }
        }

        // Indicate that the substrings have been revealed
        System.out.println("\n\nSubstrings Revealed. Commencing reverse sequence...\n");
        
        // Pause for dramatic effect
        try 
        {
            TimeUnit.SECONDS.sleep(1);  // Wait for 1 second
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();  // Print the stack trace if interrupted
        }

        // Print progressively shorter substrings of the string
        for (int i = length; i > 0; i--) 
        {
            // Extract the substring from the start to the current index
            String substring = myString.substring(0, i);
            
            // Overwrite the current line in the console
            System.out.print("\r" + substring);
            System.out.flush();  // Ensure the output is printed immediately
            
            // Pause for dramatic effect
            try 
            {
                TimeUnit.MILLISECONDS.sleep(500);  // Wait for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();  // Print the stack trace if interrupted
            }
        }

        // Print the final message indicating mission completion
        System.out.println("\n\nMission Complete.");
    }
}
