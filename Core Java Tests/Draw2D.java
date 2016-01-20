public class Draw2D{

//private String[] cols =  new String[12];
private String[] rows = new String[7];

	//Setters 
//Commented till I can fill up the content
// and turn the methods into String type returners

	private String setRows(){
		String _fout="";
		for(int i=0; i<rows.length; i++){
			if(i==0 || i==rows.length-1)	_fout+="############"+"\n";
			else if(i==3) 								_fout+="#   _Me    #"+"\n";
			else 													_fout+="#          #"+"\n";		
		}
		return _fout;	
	}
	/*
	private String setRows(){
		
	}*/
	String DisplayArena01(){
		//setCols();	
		//setRows();
		return  "\n \n \n \n"+ setRows();
	}

	
}
