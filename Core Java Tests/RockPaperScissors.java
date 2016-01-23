import java.util.Scanner;
import java.util.*;

public class RockPaperScissors{
	public static void main(String[] args)
	{		
		byte r = 1;	
		while(r != 0)
		{					
		RandomByte rb = new RandomByte();
		RPS_Logic rps_l = new RPS_Logic();		
		
		byte b = 1;
		System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		byte op =rb.getRandB();
		//System.out.println(op);
		String winner = rps_l.calcWinner(b, op);			
		System.out.println(winner);
		System.out.println("Wanna play again? Then don't press 0.");		
		Scanner again = new Scanner(System.in);
		r= again.nextByte();
		}	

	}
}
