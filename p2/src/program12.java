import java.util.*;
public class program12 {
	public static void main(String args[]) {
		System.out.println("enter 4 digit num:");
		Scanner n=new Scanner(System.in);
		int num,s,d,sum=0;
		num=n.nextInt();
		d=num;
		while(d>0) {
			s=d%10;
			sum=sum+s;
			d=d/10;
		}
		System.out.println("sum:"+sum);

}
}
