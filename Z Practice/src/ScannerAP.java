import java.util.Scanner;

public class ScannerAP
	{
	static int numbers;
	static int numbersum;
	static String name;
	
	public static void main(String[] args)
		{
		System.out.println("What is your faviorte number between 5 and 100");
		Scanner userInput = new Scanner (System.in);
		numbers = userInput.nextInt();
		System.out.println("Now add " + numbers + " to 20.");
		
		System.out.println("What is the sum?");
		Scanner userInput1 = new Scanner (System.in);
		numbersum = userInput1.nextInt();
		if(numbersum < 100)
			{
			System.out.println("Good job you win!");
			}
			else
			{
			System.out.println("You lose!");
			}
	

		}

	}

