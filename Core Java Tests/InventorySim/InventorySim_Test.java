import java.util.*;

public class InventorySim_Test {
   public static void main(String args[]) {
		ByteArrayList byLi = new ByteArrayList(4);	
		byLi.add((byte)1);		
		System.out.println(byLi.get(0));
		
		byte q = 1;
		byte boxSizIn = 0;
		byte boxVal = 0;
		while(q!=0)
		{		
			System.out.println("How many boxs do you want to add?");
			Scanner scBoxs = new Scanner(System.in); 
			boxSizIn = scBoxs.nextByte();
			if(boxSizIn!=0 && boxSizIn>0){ //TODO: Replace this if with an exception trigger for 0 and negative values
				if(boxSizIn!=1){
					for(byte i=0; i<=boxSizIn; i++)
					{
						System.out.println("What is the box value?");
						Scanner scBoxVal = new Scanner(System.in);
						boxVal = scBoxVal.nextByte();
						//
						//TODO: Add logic code to add the number of ArrayList entries equal to the boxs being added and then add the box values
						//TODO: Afterwards add a system to select if want to make the boxs parental to each other. Create a hiearchie system of boxs 
					}
				}else{

				}
			}

			//Repeat Program?			
			System.out.println("Do you wanna add more boxs? 0 if no, anything else for yes.");
			Scanner scRep = new Scanner(System.in);
			q = scRep.nextByte(); 	
		}	
	}
}
