import java.util.*;
public class prog8 {
	public static void main(String args[]) {
		System.out.println("enter distance in feet:");
		Scanner n=new Scanner(System.in);
		Float feet,inches,miles,yards;
		feet=n.nextFloat();
		inches=feet*12;
		miles=feet/5280;
		yards=feet/3;
		System.out.println("In inches:"+inches+"\nIn miles:"+miles+"\nIn yards:"+yards);
		
	}

}
