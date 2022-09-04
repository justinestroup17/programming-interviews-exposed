/*
 * This program prints the numbers from 1 to 100. However, if a number is divisible
 * by 3, "Fizz" is printed instead of the number, if a number is divisible by
 * 5, "Buzz" is printed instead of the number, and if a number is divisible by
 * both 3 and 5, "FizzBuzz" is printed instead of the number.
 */
public class FizzBuzz
{
    public static void main(String[] args)
    {
        // Iterate through numbers 1 to 100
        for (int i = 1; i <= 100; i++)
        {
            boolean divByThree = (i % 3 == 0); // Divisible by 3
            boolean divByFive = (i % 5 == 0); // Divisible by 5

            if (divByThree && divByFive)
                System.out.println("FizzBuzz");
            else if (divByThree)
                System.out.println("Fizz");
            else if (divByFive)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}