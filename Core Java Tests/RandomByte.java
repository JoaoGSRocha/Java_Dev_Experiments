import java.util.Random;

public final class RandomByte {
  	
	private static final void main(String... aArgs){
		System.out.println(getRandB());	
	}
  
  private static final byte Calc(String... aArgs){
    Random randomGenerator = new Random();
		byte[] nByte = new byte[1];
    randomGenerator.nextBytes(nByte);
		log(nByte[0]);   	
		return nByte[0];
  }
  
  public static void log(byte n){
		System.out.println(n);
  }

  public static final byte getRandB(){
		byte b;     
		b= Calc();
		return b;
  }

}
 
