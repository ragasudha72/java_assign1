import java.util.*;
public class prog5 {
	public static void main(String args[])
	{
		System.out.println("enter meal amount and local tax:");
		Scanner n=new Scanner(System.in);
		Float rate,tax,tip;
		rate=n.nextFloat();
		tax=n.nextFloat();
		tip=(18*rate)/100;
		Float total=tip+rate+tax;
		System.out.println("total amount:"+total);
		
	}
}
