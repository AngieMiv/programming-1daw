import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		int number = (int)(Math.random() * 101); // Number to guess btw 0 and 100
		System.out.println("Guess a number between 1 and 100.\nYou have 10 tries.");

		int guess = sc.nextInt(); // "guess" will be the number the user writes.
		int tries = 1;

		while (guess != number){
			if (guess < number){
				System.out.println("+ The number is greater than " + guess + ". Try again.");
				tries++;
				guess = sc.nextInt();
			} // end of while <
			if (guess > number){
				System.out.println("- The number is smaller than " + guess + ". Try again.");
				tries++;
				guess = sc.nextInt();
			}
			if (tries > 11){
				System.out.println("You wasted your 10 tries.\nEnd of game.");
				System.exit(0);
			}
		}
		if (guess == number){
			System.out.println("^_^ You won! That's the number :)");
			System.out.println("You tried " + tries + " times");
			System.out.println("End of game.");
		}
		sc.close();
	} // end of public static void main(String[] args)
} //end of public class
