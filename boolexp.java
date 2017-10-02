import java.util.*;

interface booleanExpression
{
  public boolean EvaluateExpression(String s);

}

public class boolexp implements booleanExpression 
{
	public boolean EvaluateExpression(String str)
	{
		boolean a=true, b=true, a_value=false, b_value=false;
		int operator=0;//for "OR" operator=1 and for "AND" operator=0
 		int n = str.length();
 		for (int i = 0; i<n; i++)
		{
		    if(a_value == true && b_value == true) 
			{
			    if(operator==1)
			        a=a||b;
			    else
			        a=a&&b;
				b_value = false;
			}
			if(str.charAt(i) == 'T' || str.charAt(i) == 'F')
			{
				if(a_value == false)
				{
					if(str.charAt(i)=='T')
					    a = true;
					else
					    a= false;
					a_value = true;
				}
				if(b_value == false)
				{
					if(str.charAt(i)=='T')
					    b = true;
					else
					    b= false;
					b_value = true;
				}
			}
			if(str.charAt(i)=='O' || str.charAt(i)=='A')
			{
				    if(str.charAt(i)=='O')
					    operator = 1;
					else
					    operator = 0;
			}
			if(str.charAt(i)=='(' )
			{
				b = EvaluateExpression(str.substring(i+1));
				b_value = true;
			}
			
		}
		return a;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		boolexp B = new boolexp();
		boolean value = B.EvaluateExpression(str);
		System.out.println(value);
	}
}




