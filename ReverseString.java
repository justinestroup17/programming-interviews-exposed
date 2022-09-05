/*
 * This program takes a string as input and outputs it reversed.
 */

import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class ReverseString
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        char answer = 'y';
        do
        {
            System.out.println("Enter a string to reverse followed by the ENTER key:");

            String myString = input.nextLine();

            String newString = reverse(myString);
            System.out.println("Your string " + myString + " reversed is " + newString);
            System.out.print("Would you like to enter another string? Type Y for yes and N for no: ");
            answer = input.next().charAt(0);
            input.nextLine(); // Take in newline char so next iteration starts with user string input
        } while (answer == 'y' || answer == 'Y');
    }

    public static String reverse(String input)
    {
        // Length must be equal to input string
        int len = input.length();
        StringBuilder output = new StringBuilder(len);

        // Iterate through characters of string backwards
        for (int i = len - 1; i >= 0; --i)
        {
            // Append characters to new string
            output.append(input.charAt(i));
        }
        return output.toString();

    }
}
