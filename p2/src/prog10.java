import java.lang.Math.*;
import java.util.*;
public class prog10 {
	public static void main(String args[]) {
		System.out.println("Enter height:");
		Scanner n=new Scanner(System.in);
		double h,g=9.8,is=0,vf;
		h=n.nextDouble();
		vf=Math.sqrt(is*is+2*g*h);
		System.out.println("vf:"+vf);
	}

}
