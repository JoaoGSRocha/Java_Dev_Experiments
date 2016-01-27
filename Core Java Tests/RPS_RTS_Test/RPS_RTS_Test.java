public class RPS_RTS_Test {
	public static void main(String args[])
	{	
		byte rN=0;
		RandomByte rand = new RandomByte();
		rN = rand.getRandB();
		if(rN<10)
			getCIvsPCC();
		else System.out.println("Nope.");
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
