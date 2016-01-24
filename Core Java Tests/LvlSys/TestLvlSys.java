import java.util.*;
public class TestLvlSys {
	public static void main(String[] args)
	{
		
		System.out.println("Hello!");
		byte q = 1;
		byte lvl = 5;		
		while(q!=0){
			System.out.println("Choose one of the following options:"
				+ "\n Raise lvl - 2"			
				+ "\n See your level - 1"
				+"\n Exit game - 0");
				Scanner sc = new Scanner(System.in);
			q= sc.nextByte();
			if(q==1){
				System.out.println(
					 "----------------------------"			
					+"\n \n You are: lvl 5;"
					+" \n \n"
					+"----------------------------");
			}
			if(q==2){
				lvl++;
				System.out.println(
					 "----------------------------"			
					+"\n \n You lvl'ed up!; \n You are now: lvl "+lvl+"!"
					+" \n \n"
					+"----------------------------");
			}
		}
	}
}
