public class RPS_RTS_Test {
	public static void main(String args[])
	{	
		byte rN=0;
		RandomByte rand = new RandomByte();
		rN = rand.getRandB();
		byte rps_tok[] = new byte[3]; // Cav, Inf, Arch
		byte enem, you = 0; 
		for(byte c=0; c<rps_tok.length; c++)
		{
			rps_tok[c]=c;
		}
		if(rN>10 && rN<51)
			System.out.println("They have fleed on the encounter of your kingdom!");
		else if(rN>50)
			System.out.println("They have infantry against you!");
			enem = rps_tok[0]; 
		else if(rN<-11 && rN>-90)
			System.out.println("They have archers against you!");
			enem = rps_tok[1];		
		else if(rN>-10 && rN<=10)
			System.out.println("They have cavalry against you!");
			enem = rps_tok[2];		
		else
			System.out.println("It is not know what they have against you");
	}

	public static void getCIvsPCC()
	{ // CC - Inf. PC - Cav. 
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCAvsPCI()
	{ // CC - Arc. PC - Inf.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCCvsPCA()
	{ // CC - Cav. PC - Arc.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCCvsPCI()
	{ // CC - Cav. PC - Inf.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCIvsPCA()
	{ // CC - Inf. PC - Arc.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCAvsPCC()
	{ // CC - Arc. PC - Cav.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCCvsPCC()
	{ // CC - Cav. PC - Cav.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCIvsPCI()
	{ // CC - Inf. PC - Inf.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
	public static void getCAvsPCA()
	{ // CC - Arc. PC - Arc.
		System.out.println("Let's make this Rock Paper Scissors out of Cavalery, Archery and Infantry");
		System.out.println("0 ---"+"\n1 I I"+"\n2    "+"\n3    "+"\n4    "+"\n5 C C"+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2 I I"+"\n3    "+"\n4 C C"+"\n5    "+"\n6 ---\n\n");
		System.out.println("0 ---"+"\n1    "+"\n2    "+"\n3 C C"+"\n4    "+"\n5    "+"\n6 ---\n\n");	
		System.out.println("You have won this battle. Well done sir.");	
	}
}
