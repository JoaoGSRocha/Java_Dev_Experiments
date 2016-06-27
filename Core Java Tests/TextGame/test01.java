import java.util.Scanner;
public class test01{
	//All code is working and it makes sense! It's simple but it's all working!
	public static void main(String[] args)  {
		
		//Class/Constructors call
		calculations c1 = new calculations();
		textInput i1 = new textInput();
		Draw2D d2d = new Draw2D();		
		Movement m = new Movement();

		int i = 1;
		System.out.println(i1.setQuestion());

		//Menu loop till 0 is verified		
		while(i != 0)
		{					
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			int s = c1.sum();
			//System.out.println(i1.setResponse(i, s, c1.response(), i1.response()));
			System.out.println(d2d.DisplayArena01());
			d2d();
			//c1.updateNotifications();
		}	
	}
}

