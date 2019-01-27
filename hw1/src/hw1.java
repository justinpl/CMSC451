
public class hw1 
{
	static int triangular(int n)
	{
	int result = 0;
	for (int i = 1; i <= n; i ++)
	result += i;
	return result;
	}
	
	static int pentagonalr(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		return  pentagonalr(n-1) + 3 * n-2;
	}
		
	public static void main(String[] args) 
	{
		System.out.println(triangular(4));
		System.out.println(pentagonalr(4));
	}
}
