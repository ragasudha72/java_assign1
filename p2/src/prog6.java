import java.util.*;
public class prog6 {
	public static void main(String args[])
	{
		System.out.println("enter n:");
		Scanner n=new Scanner(System.in);
		int num;int res;
		num=n.nextInt();
			res=(num*(num+1))/2;
		System.out.println("sum:"+res);
	}
}
