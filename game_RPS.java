import java.util.Scanner;

public class game_RPS {
	final static int rock=1, paper=2, scissor=3;
	public static void main(String[] args) throws InterruptedException {

	
	Scanner sc = new Scanner(System.in);
	System.out.println("Player A Enter your name");
	String playera = sc.nextLine();
	System.out.println("Player B Enter your name");
	String playerb = sc.nextLine();
	System.out.println("Welcome "+playera+" & "+playerb+" for the game of ROCK,PAPER,SCISSORS");
	System.out.println("RULES");
	System.out.println("Press 1 = ROCK");
	System.out.println("Press 2 = PAPER");
	System.out.println("Press 3 = SCISSORS");
	System.out.println(playera+" Enter your choice");
	int a = sc.nextInt();
	System.out.println(playerb+" Enter your choice");
	int b = sc.nextInt();
	System.out.println("---------------------------------------------");
	System.out.println("Gaming.........");
	Thread.sleep(1500);
	if(a==b)
	{
		System.out.println("The game is a tie");
	}
	else
	{
		switch(a)
		{
		case rock:
			if(b==2)
			{
				System.out.println(playerb+" Wins");
			}
			else if(b==3)
			{
				System.out.println(playera+" Wins");
			}
			else
			{
				System.out.println(playerb+" Lost");
			}
			break;
		case paper:
			if(b==3)
			{
				System.out.println(playerb+" Wins");
			}
			else if(b==1)
			{
				System.out.println(playera+" Wins");
			}
			else
			{
				System.out.println(playerb+" Lost");
			}
			break;
		case scissor:
			if(b==1)
			{
				System.out.println(playerb+ " Wins");
			}
			else if(b==2)
			{
				System.out.println(playera+" Wins");
			}
			else
			{
				System.out.println(playerb+" Lost");
			}
			break;
		}

	}
	System.out.println("---------------------------------------------");
	System.out.println("Have a great day and great gaming");
}
}
