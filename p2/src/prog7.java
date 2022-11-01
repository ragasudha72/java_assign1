import java.util.*;
public class prog7 {
	public static void main(String args[])
	{
		Float savings1,savings2,savings3,interest1,interest2,interest3,t1,t2,t3;
		System.out.println("enter savings:");
		Scanner n=new Scanner(System.in);
		savings1=n.nextFloat();
		interest1=(4*savings1)/100;
		t1=interest1+savings1;
		System.out.println("after 1 year:"+t1);
		interest2=(4*t1)/100;
		t2=t1+interest2;
		System.out.println("after 2 years:"+t2);
		interest3=(4*t2)/100;
		t3=t2+interest3;
		System.out.println("after 3 years:"+t3);
		
	}

}
