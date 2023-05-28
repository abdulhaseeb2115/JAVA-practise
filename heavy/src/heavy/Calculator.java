package heavy;

import java.util.*;
public class Calculator {
public static void main(String[] args) { 

    // INITIAL OUTPUT...
    
System.out.println("PRESS::(\'A\'--for Arth calculations)-------(\'T\'--for Trig calculations)-------(\'D\'--for Determinant)\n"+
			"       (\'F\'--for Factorial)-(\'RD\'--for Rad to Deg)-(\'DR\'--for Deg to Rad)-(\'P\'--for Perfect Square)\n"+
			"       (\'SR\'--for Square root)----(\'SQ\'--for Square)----(\'DI\'--for Disc)----(\'DB\'--for Deci to Bin)\n"+
			"       (\'BD\'--for Bin to Deci)-(\'PW\'--for Power)-(\'L\'--for Lcm)--");
//loop//
String loop="m";
// INPUT...
Scanner inp=new Scanner(System.in);
do {

    System.out.print("What do you want to do?");
    String choice=inp.next();
 
 
/////////////// CALCULATIONS\\\\\\\\\\\\\\\\\.
 
//ARTHEMATIC//
 if (choice.equalsIgnoreCase("a")) {
	
	System.out.print("Enter 1st Number:");
	 double x=inp.nextDouble();
	System.out.print("Enter Operator:");
	 char op=inp.next().charAt(0);
	System.out.print("Enter 2nd Number:");
	 double y=inp.nextDouble();
	 
if (op=='+'){
          x=x+y;
          System.out.println(x);}
else if (op=='-') {
          x=x-y;
          System.out.println(x);}
else if (op=='*') {
          x=x*y;
          System.out.println(x);}
else if (op=='/') {
         
           if (y!=0) {
               x=x/y;
               System.out.println(x);}
           else {
 System.out.println("Not Possible");}
}} 

//TRIGNOMETRIC//
 

else if (choice.equalsIgnoreCase("t"))
	
   {System.out.print("For angle in Degree press 'd' and for Radians press 'r':");
    char angle=inp.next().charAt(0);
  // degrees code..	
   if(angle=='d') 
	  { System.out.print("[sin,cos,tan,csc,sec,cot]\nEnter Trig Fn:");
	    String function=inp.next();
	    char fn=function.charAt(1);
	    char fns=function.charAt(2);
	    System.out.print("Enter Angle:");
	    double ang=inp.nextDouble();
	   
	    if(fn=='i') {
            System.out.println("sin("+ ang +")="+Math.sin(ang));}
	    else if(fn=='o') {
            System.out.println("cos("+ ang +")="+Math.cos(ang));}
	    else if(fn=='a') {
            System.out.println("tan("+ ang +")="+Math.tan(ang));}
	    else if(fn=='e') {
            System.out.println("Sec("+ ang +")="+(1/Math.cos(ang)) );}
	    else if(fn=='s') {
            System.out.println("csc("+ ang +")="+(1/Math.sin(ang)) );}
	    else if(fn=='o' && fns=='t') {
            System.out.println("cot("+ ang +")="+ (Math.cos(ang)/Math.sin(ang)) );}}            
  // radians code.. 
  else if (angle=='r')         
       { System.out.print("[sin,cos,tan,csc,sec,cot]\nEnter Trig Fn:");
       String function1=inp.next();
       char fn1=function1.charAt(1);
       char fns1=function1.charAt(2);
       System.out.print("Enter Angle:");
       double ang0=inp.nextDouble();
       double ang1=Math.toDegrees(ang0);
      
       if(fn1=='i') {
           System.out.println("sin("+ ang0 +")="+Math.sin(ang1));}
       else if(fn1=='o') {
           System.out.println("cos("+ ang0 +")="+Math.cos(ang1));}
       else if(fn1=='a') {
           System.out.println("tan("+ ang0 +")="+Math.tan(ang1));}
       else if(fn1=='e') {
           System.out.println("Sec("+ ang0 +")="+(1/Math.cos(ang1)) );}
       else if(fn1=='s') {
           System.out.println("csc("+ ang0 +")="+(1/Math.sin(ang1)) );}
       else if(fn1=='o' && fns1=='t') {
           System.out.println("cot("+ ang0 +")="+ (Math.cos(ang1)/Math.sin(ang1)) );}}}
           
 
 // determinent//
 
else if (choice.equalsIgnoreCase("d")) 
     {System.out.println("Enter a 3X3 Matrix..");                              
	  System.out.print("Enter elements seperated by comma..\nEnter 1st Row:");
	  String x=inp.next();
	  int x1=Character.getNumericValue(x.charAt(0));
	  int x2=Character.getNumericValue(x.charAt(2));
	  int x3=Character.getNumericValue(x.charAt(4));
	
	  System.out.print("Enter 2nd Row:");
	  String y=inp.next();
	  int y1=Character.getNumericValue(y.charAt(0));
	  int y2=Character.getNumericValue(y.charAt(2));
	  int y3=Character.getNumericValue(y.charAt(4));
 
	  System.out.print("Enter 3rd Row:");
	  String z=inp.next();
	  int z1=Character.getNumericValue(z.charAt(0));
	  int z2=Character.getNumericValue(z.charAt(2));
	  int z3=Character.getNumericValue(z.charAt(4));
	
	  int det=(x1*((y2*z3)-(z2*y3)))+(-y1*((x2*z3)-(z2*x3)))+(z1*((x2*y3)-(x3*y2)));
	  System.out.println("|"+x1+" "+x2+" "+x3+"|\n"+"|"+y1+" "+y2+" "+y3+"| ="+det+"\n"+
			"|"+z1+" "+z2+" "+z3+"|");}
 
 //factorial///
 
else if (choice.equalsIgnoreCase("f")) 
	 {System.out.print("Enter number:");
	 int x=inp.nextInt();
	 int y=x;
     int fact=1;
     while (y>0) {
	              fact=fact*y;
	              y=y-1;}
	 System.out.println("Factorial of "+x+" = "+fact);  }
 
 //square root///

else if (choice.equalsIgnoreCase("sr")) 
     {System.out.print("Enter number:");
	 double num=inp.nextDouble();
     double ans=Math.pow(num, 0.5);
     System.out.println("Square Root of "+num+" = "+ans);} 
 
 //square//

else if (choice.equalsIgnoreCase("sq"))
      {System.out.print("Enter number:");
	  double num=inp.nextDouble();
	  double ans=Math.pow(num,2);
	  System.out.println("Square of "+num+" = "+ans);} 
 
 //rad to deg//
else if (choice.equalsIgnoreCase("rd"))
    {System.out.print("Enter angle in Rad:");
     double rad=inp.nextDouble();
     System.out.println(rad+"Rad = "+Math.toDegrees(rad)+" Deg");}

 //deg to rad//
else if (choice.equalsIgnoreCase("dr"))
    {System.out.print("Enter angle in Deg:");
     double deg=inp.nextDouble();
     System.out.println(deg+"Deg = "+Math.toRadians(deg)+" Rad");}

 //dicsriminant//
else if (choice.equalsIgnoreCase("di"))
    {System.out.print("Enter values of a,b,c seperated by commas:");
     String abc=inp.next();
     int a=Character.getNumericValue(abc.charAt(0));
     int b=Character.getNumericValue(abc.charAt(2));
     int c=Character.getNumericValue(abc.charAt(4));
     double disc=(Math.pow(b,2))-(4*a*c);
     System.out.println("Discriminant = "+disc);}
 //perfect square//
else if (choice.equalsIgnoreCase("p"))
   {System.out.print("Enter Number:");
    int x=inp.nextInt();
    double ans=Math.pow(x, 0.5);
    
    if (ans%2==0 || ans%2==1)
     {System.out.println(x+" is a perfect square");}
    else {
     System.out.println(x+" is not a perfect square");}}
 
 //decimal to binary//
else if (choice.equalsIgnoreCase("db")) 
   {System.out.print("Enter Number:");
    int dec=inp.nextInt();
    int[] bin=new int[35];
    int i=0;
     
    while (dec>0) 
    {int ans=dec%2;
	 dec=dec/2;
	 bin[i]=ans;
	 i++;}
     
	 int j=34;
	while(j>=0) 
	{if (bin[j]==1) {
		
		while(j>=0) {
		System.out.print(bin[j]);	
		j--;}
		break;}
    j--;}}	
	
 //binary to decimal//
else if(choice.equalsIgnoreCase("bd"))
    {System.out.print("Enter Number:");
     String bins=inp.next();
     int ln=bins.length();
     int i=ln-1;
     int p=0;
     double sum=0;
     while (i>=0) {
     sum=sum+((Character.getNumericValue(bins.charAt(i)))*(Math.pow(2, p))); 
     i--;
     p++;}
     System.out.println(sum);}
     
 //Power//
else if(choice.equalsIgnoreCase("pw"))
   {System.out.print("Enter Number:");
    double x=inp.nextDouble();
    System.out.print("Enter Power:");
    double y=inp.nextDouble();
    System.out.println(x+" raised to power "+y+" = "+Math.pow(x, y));}

 //Lcm//
else if(choice.equalsIgnoreCase("L"))
   {System.out.print("Enter first number:");
    int x=inp.nextInt();
    System.out.print("Enter second number:");
    int y=inp.nextInt();
    
    int lcm;
    int gtr;
    if(x>y) { gtr=x;}
    else {gtr=y;}
    
    while(true)
    {if (gtr%x==0 && gtr%y==0)
     {lcm=gtr;
      break;}
      gtr=gtr+1;}
    System.out.println("Lcm of "+x+" and "+y+" = "+lcm);}
else {System.out.println("Invalid Operation..");}
 //Loop// 
System.out.print("Press M for more calculations:");
 String loop1=inp.next();
  loop=loop1;
}
while(loop.equalsIgnoreCase("m"));
System.out.println("\nGood Bye..");
inp.close();
}}

		
		
		
		
		
		
		
	


