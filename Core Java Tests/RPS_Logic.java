public class RPS_Logic {
	private byte op_move;
	private byte setOpMoves(byte b, byte op){
		byte op_move = 0;		
		if(op >0)
		{ 
			if(op>55) op_move=0;
			else 			op_move=1;
		}
		else{
			op_move=2;
		}	
		//log(op_move); for testing
		return op_move;
	}
  public  void log(byte n){
		System.out.println(n);
  }
	public String calcWinner(byte b, byte op){
		op_move = setOpMoves(b, op);
		String win=" ";		
		if(b==1&&op_move==1)
		{
			win="PC";
		}else if(b==2&&op_move==2)
		{
			win="PC";
		}else if(b==3&&op_move==0)
		{
			win="PC";
		}else{	win="ME!";}
		//log(op_move); for testing
		return win;
	}
}
