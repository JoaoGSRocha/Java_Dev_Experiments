public class Draw2D{

private String[] cols =  new String[12];
private String[] rows = new String[7];

	//Setters 
//Commented till I can fill up the content
// and turn the methods into String type returners
//ID of Map Tiles
//0-Nothing, 1-Wall, 2-Player, 3-Loot, 4-NPC
public Draw2D(){
	//setASpecArea2D_St();
}

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

private void setASpecAreaID_St(){
  byte _c =  12; byte _r =  7;
	byte inCells[][] = new byte[12][7];
	byte ouCells[][] = new byte[12][7];
	byte cells[][] = new byte[12][7];
	char tokens[][] = new char[12][7];
	String _row_out=""; //Row by row output 
	for(int r=0; r<= _r; r++){	
		for(int c=0; c<= _c; c++){
			if(cells[r][c] == 0)					
				IDcells[r][c] = 0;				
//Token verification method to be replaced
			if(cells[r][c] == 0)				//should be a case switch in the future
				tokens[r][c]= '#';
			if()
		}
	}
	//setASpecArea2D_St(cells[rows][cols]);
}



private void setASpecArea2D_St(byte cells[][]){
  byte _c =  12; byte _r =  7;
	char tokens[][] = new char[12][7]; 
	
	for(int r=0; r<= _r; r++){	
		for(int c=0; c<= _c; c++){	
			if(cells[r][c] == 0)
				tokens[r][c]= '#'; // It should be ' ',but we're testing
		}
	}
	//setASpecArea2D_final(tokens);
}


private void setASpecArea2D_final(byte[][] ce){
  byte _c =  12; byte _r =  7;
	char tokens[][] = new char[12][7]; 
	String _row_out=""; //Row by row output
	for(int r=0; r<= _r; r++){	
		for(int c=0; c<= _c; c++){	
			if(ce[r][c] == 0)//The following part of the code will become the method void tokensVerification(){}
				tokens[r][c]= '#'; // It should be ' ',but we're testing
			_row_out+= tokens[r][c];
			if(c==_c){
				System.out.println(_row_out);
				_row_out="";
			}
		}
	}	
}

private void tokensVerification(String _r_o, char[][] tokens, byte[][] ce, int r, int c/*We should replace all of them by bytes later */ )
{

	if(ce[r][c] == 0)
		tokens[r][c]= '#'; // It should be ' ',but we're testing
	_r_o+= tokens[r][c];
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
