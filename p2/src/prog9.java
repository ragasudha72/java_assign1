import java.util.*;
public class prog9 {
	public static void main(String args[]) {
		double pi=3.14;
		System.out.println("enter radius:");
		Scanner n=new Scanner(System.in);
		double r,ac,vs;
		r=n.nextFloat();
		ac=r*r*pi/2;
		vs=(4*pi*r*r*r)/3;
		System.out.println("area of circle:"+ac+"\nvolume of sphere:"+vs);
	}

}
