import java.util.*;
public class WindChill {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter temp in Farenheit B/W -58F and 41F:");
    double ta=input.nextDouble();
    System.out.print("Enter Wind speed more than 2 miles:");
    double v=input.nextDouble();
    double WindChill;
    WindChill=(35.74+0.6215*ta)-(35.75*(Math.pow(v,0.16)))+(0.4275*ta*(Math.pow(v,0.16)));
    System.out.println("Windchill index is:"+WindChill);
	}

}
