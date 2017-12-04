
import java.util.Scanner;

/**
 * Program that performs the fibonacci sequence.
 */
public class FibonacciSequence
{
    public static void main(String[] args)
    {
        int limit   = 0;
        int sum     = 0;
        Scanner kBd = new Scanner(System.in);

        // Prompt for a repetition limit
        System.out.print("Sum from 0 to...? ");
        limit = kBd.nextInt();

        sum = ( limit *( limit + 1 ) ) / 2;

        // Display finished stuff
        System.out.println("\nThe sum of the numbers between 1 and " + limit + " is..." + sum);
        System.out.println("\n\n**** end of Lab0601 ****\n\n");
    }
}
