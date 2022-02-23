
public class conv {
	
	public static void main(String[] args) {
		
		 
	    int decimal, modulo;
	    
	    String binario ="";
	    
	    
	  	    		int n = 417;
	    while (n > 0) {
	      modulo = (n % 2 );
	      binario = modulo + binario;
	      n = n / 2;
	    }
	    
	    
	    
	    System.out.println("El num b: "+binario);
	    
	    int num, ud, c=0, d = 0;
	    
	  

	  num = Integer.parseInt(binario);
	    
	    
	    
		while(num != 0) {
			
			ud = num%10;
			d+=ud*Math.pow(2, c);
			c++;
			num/=10;
		}
		
	    
	    System.out.println("El num d: "+d);
	    
	    int decimal2, modulo2;
	    
	    String binario2 ="";
	    
	    
	  	    		
	    while (d > 0) {
	      modulo2 = (d % 2 );
	      binario2 = modulo2 + binario2;
	      d = d / 2;
	    }
	    
	    System.out.println("El num b: "+binario);
	    

	}
	
	//By Héctor Castillo


}
