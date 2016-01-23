import java.util.Scanner;
import java.util.*;

public class TicTacToe{
	public static void main(String[] args)
	{
		RandomByte rb = new RandomByte();
		byte b = 1;
		System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		byte op =rb.getRandB();
		byte op_move = 0;		
		if(op >0)
		{ 
			if(op>55) op_move=0;
			else 			op_move=1;
		}
		else{
			op_move=2;
		}
	}
}
