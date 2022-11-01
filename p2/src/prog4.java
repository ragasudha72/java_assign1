import java.util.*;
public class prog4 {
	public static void main(String args[])
	{
		System.out.println("enter number of containers:");
		Scanner n=new Scanner(System.in);
		int num;double sum1=0;double sum2=0;
		float size;
		num=n.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println("enter container "+i+" size:");
			size=n.nextFloat();
			if(size>=1) {
				sum1=sum1+0.25;
			}
			else {
				sum2=sum2+0.10;
			}
		}
		double res=sum1+sum2;
		System.out.println("$"+res);
	}

}
