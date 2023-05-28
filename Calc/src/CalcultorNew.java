import java.util.*;
public class CalcultorNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner (System.in);
		System.out.print("Enter Your Equation::");
		String eq=inp.next();
		
		char eqar[]=  new char[35];
		for(int i=0;i<eq.length();i++){
			eqar[i]=eq.charAt(i);
		}
		  for(int j=0;j<eqar.length;j++) {
			if(eqar[j]=='*') {
			        int x=0;
                    int y=0;				
				    
				    int tot1=0;
			        int pwr1=0;
				    for(int k=j-1;(k>=0 && eqar[k]!='-' && 
				    		       eqar[k]!='/' && eqar[k]!='*' && 
				    		       eqar[k]!='+');k--) {
				    	
				    	System.out.println(eqar[k]);
					    tot1+=(Character.getNumericValue(eqar[k])*Math.pow(10, pwr1));
					    pwr1++;
					    x++;
			        }
				    int tot2=0;
			        int pwr2=0;
				    for(int k=j+1;(eqar[k]!='+' && eqar[k]!='-' && 
			    		       eqar[k]!='/' && eqar[k]!='*' && 
			    		            k<eq.length());k++) {
				    	
			    	    System.out.println(eqar[k]);		      
				        tot2+=(Character.getNumericValue(eqar[k])*Math.pow(10, pwr2));
				        pwr2++;
				        y++;
	            	}
				    
				    int tot3=0;
				    while(tot2 != 0) {
			            int digit = tot2 % 10;
			            tot3 = tot3 * 10 + digit;
			            tot2 /= 10;
			        }
				    int ans=tot1*tot3;
				    int add=x+y+1;
				    System.out.println(tot1+" X "+tot3+ "="+ans+"   "+x+"  "+y);		    
		   }
		
		
	     }
		  }}

