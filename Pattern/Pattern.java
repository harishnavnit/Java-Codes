import java.util.*;

public class Pattern {
	
	public static void main(String args[]) {
	
		for(int i=1;i<=4;i++) {
			
			for(int j=0;j<=(4-i);j++)
			  System.out.print(" ");
			    if(i==1)
			      System.out.println(" 1");
			    else {
			      for(int j=1;j<=i;j++)
				System.out.print(j+" ");
				System.out.println("1");
			    }
		}
	}
} 
