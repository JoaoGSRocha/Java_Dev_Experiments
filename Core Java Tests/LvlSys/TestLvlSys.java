import java.util.*;
public class TestLvlSys {

	public static void MenuOptions(){
			switch(q){
				case 0:
					System.exit(0);
					break;
				case 1:
					System.out.println(
						 "----------------------------"			
						+"\n \n You are: lvl "+lvl+";"
						+" \n \n"
						+"----------------------------");
					break;
				case 2:
					lvl++;
					System.out.println(
						 "----------------------------"			
						+"\n \n You lvl'ed up!; \n You are now: lvl "+lvl+"!"
						+" \n \n"
						+"----------------------------");
					break;
				case 3:
					System.out.println(
						 "----------------------------"			
						+"\n \n You K.O. the following opponents:"
						+"\n Troll x"+ trollQnt
						+" , Wind Creature x"+wCQnt
						+", Troll Human Assistant x"+trAssQnt+" !"
						+" \n \n"
						+"----------------------------");
					break;
			}
	}
	public static void main(String[] args)
	{
		System.out.println("Hello!");
		byte q = 1;
		byte lvl = 5;
		byte trollQnt = 1;
		byte wCQnt = 5;
		byte trAssQnt = 3;		
		while(q!=0){
			System.out.println("Choose one of the following options:"
				+ "\n Raise lvl - 2"			
				+ "\n See your level - 1"
				+"\n Fight! - 3" //In future the enemies should be generated randomly, and in future
												 // they should be generated randomly according the place you are at
				+"\n Exit game - 0");
				Scanner sc = new Scanner(System.in);
			q= sc.nextByte();
		}
	}
}
