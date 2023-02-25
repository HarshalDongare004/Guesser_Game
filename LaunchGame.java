//LaunchGame
import java.util.*;

class Guesser{
	int guessNum;
	int validNum;
	
	int guessNum()
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("Guesser kindly guess the number");
			//input only 0 to 9
			
			boolean flag = true;
			while (flag)
			{
				guessNum = scan.nextInt();
				
				if(guessNum> 0 && guessNum<=9 ){
					
					flag = false;
					validNum = guessNum;
				System.out.println("Your number is valid.");
				
				}
			else{
				System.out.println("Invalid number please enter nuber between 0 to 9");
				}
			}
			return guessNum;
			
			
			
	}
}

class Player
{
	int guessNum;
	int validNum;

//TO COUNT NO OF PLAYERS	
	static int playerCount = 0;
	
	int guessNum()
	{
		playerCount++;
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("Enter the predicted number by player "+playerCount);
			
			boolean flag = true;
			while(flag)
			{
				guessNum = scan.nextInt();
				
				if(guessNum>0 && guessNum<=9)
				{
					validNum = guessNum;
					System.out.println("Valid number predicted by player "+ playerCount);
					flag = false;
				}
				else
				{
					System.out.println("Please predict number between 0 to 9");
				}
			}
			
			
			return validNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	
	void collectNumFromGuesser(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	void collectNumFromPlayers(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		numFromPlayer4 = p4.guessNum();
	}
	void compare(){
		
		if(numFromGuesser == numFromPlayer1)
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4){
				System.out.println("All players won the game.");
				
				
			}
			else if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
				System.out.println("Player 1, Player 2 and player 3 won the game.");
			}else if(numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer4){
				System.out.println("Player 1, Player 3 and player 4 won the game.");
			}else if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer4){
				System.out.println("Player 1, Player 2 and player 4 won the game.");
			}
			else if(numFromGuesser == numFromPlayer2){
				System.out.println("Player 1 and player 2 won the game.");
			}
			else if(numFromGuesser == numFromPlayer3){
				System.out.println("Player 1 and Player 3  won the game.");
			}
			else if(numFromGuesser == numFromPlayer4){
				System.out.println("Player 1  and player 4 won the game.");
			}
			else{
			
			System.out.println("Player 1 won the game.");
		}
		}
		else if(numFromGuesser == numFromPlayer2){
			System.out.println("Player 2 won the game.");
		}
		else if(numFromGuesser == numFromPlayer3){
			System.out.println("Player 3 won the game.");
		}
		else if(numFromGuesser == numFromPlayer4){
			System.out.println("Player 4 won the game.");
		}
		else {
			System.out.println("Game Lost TrY angain");
		}
	}
}
public class LaunchGame{
	public static void main(String[] args){
			Umpire u = new Umpire();
			u.collectNumFromGuesser();
			
			u.collectNumFromPlayers();
			
			
			u.compare();
	}
}
	