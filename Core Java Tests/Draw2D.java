public class Draw2D{

//private String[] cols =  new String[12];
private String[] rows = new String[7];

	//Setters 
//Commented till I can fill up the content
// and turn the methods into String type returners
//ID of Map Tiles
//0-Nothing, 1-Wall, 2-Player, 3-Loot, 4-NPC

	private byte setTileID_0(){
		return 0;
	}
	private byte setTileID_1(){
		return 1;	
	}
	private byte setTileID_2(){
		return 2;	
	}
	private byte setTileID_3(){
		return 3;	
	}
	private byte setTileID_4(){
		return 4;	
	}
/*
	private byte setRowsID(byte mov_inp){ // I will received the intrepreted input from player
		String _fBOut="";										// or other event that makes the map change
		for(int i=0; i<rows.length; i++){
			if(i==0 || i==rows.length-1)	_fSOut+="############"+"\n";
			else if(i==3) 								_fSOut+="#   _Me    #"+"\n";
			else 													_fSOut+="#          #"+"\n";		
		}
		return _fBOut;	
	}
*/
private byte setASpecRowID(){
	byte row[] = new byte[127];
	row[3] = 0;
	return row[3];
}
private void setASpecRowID(byte mov_inp){
	byte row[] = new byte[127];
	row[3] = 0;
	
}
	private String setRows2D(){
		String _fSOut="";
		for(int i=0; i<rows.length; i++){
			if(i==0 || i==rows.length-1)	_fSOut+="############"+"\n";
			else if(i==3) 								_fSOut+="#   _Me    #"+"\n";
			else 													_fSOut+="#          #"+"\n";		
		}
		return _fSOut;	
	}
	/*
	private String setRows(){
		
	}*/
	String DisplayArena01(){
		//setCols();	
		//setRows();
		return setRows2D();
	}

	
}
