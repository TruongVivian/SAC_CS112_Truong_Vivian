import java.util.Scanner;
import java.util.Random;

public class Game {
public static void main(String[] args) 
{ 	
	Random random= new Random();
	Scanner scanner = new Scanner(System.in);
	int user, computer;
	
	System.out.print("Please enter your choice, rock = 0, paper = 1 and scissor =2 ");
	user=scanner.nextInt();
	
	if (user<0 || user > 2)
	{
		System.out.println("We don't understand you");
		System.exit(0);
	}
	computer=random.nextInt(3);
	
	if(user==computer)
	{
		System.out.println(" you are tie");
		System.out.printf("Computer chose %d",computer);
		System.exit(0);
	}
	
	if (user ==0 ) // User choose rock
	{
		if (computer==1 )
		{ 
			System.out.println("You choose rock, computer pick paper, Computer wins!");
		}
		else 
		{
			System.out.println("You choose rock, Computer pick scissor, You win!");
		}
	}

	else if (user == 1)  //User chooses paper 
	{
		if (computer==0)
		{
			System.out.println("You pick paper, Computer chose rock, you win ! ");
		}
		else 
		{			
			System.out.println("You choose paper, Computer chose scissor");
			
		}
	}
	
	else  
	{ 
		if (computer==0) //User choose Scissors
		{ 
			System.out.println("You chose Scissors, computer chose rock, Computer wins!");
			
		}
		else 
		{ 
			System.out.println("You chose Scissors, computer chose paper, you win!");
		}
	}
	scanner.close();

	}
}
