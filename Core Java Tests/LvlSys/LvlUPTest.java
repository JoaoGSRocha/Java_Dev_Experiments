import java.util.*;
public class LvlUPTest {
	public static void main(String args[]){
		byte coins=0;
		byte rep=0;
		boolean win = true;
		boolean tie = true;
		byte play = 1;
 		byte xp=-128;
		byte lvl = 1;
		short nXp = 0; 		
		byte showXp = 0; //TODO: use this to show more beautyfull xp
		byte rankXp = 0; //TODO: use this to show more beautyfull xp
		boolean showDialog = true; 
		
		while(play!=0)
		{
			if(xp>-110 && showDialog){
				System.out.println("Congratulations, you lvl'ed up! You are lvl 1 now. \n You can now buy from the store!");
				showDialog = false;
				lvl++;
				xp = -128;
			}
			System.out.println("Do you want to play	R.P.S.? - Don't press 0.");
			Scanner sc = new Scanner(System.in);
			System.out.println("-------------------- \n \n You have "+coins+" coins. \n Your xp: "+xp);
			play = sc.nextByte();
			if(/*win*/ play ==11){
				System.out.println("You win! +3xp");
				coins+=5; xp+=3;
			}else if(/*tie*/ play ==22){
				System.out.println("You tied..Respect.. +1xp");
				coins+=1; rep+=10; xp+=1;
			}else{
				System.out.println("You lost man...another time, another time..");
				if(coins!=-128)
					coins--;
			}
		}
	}
}
