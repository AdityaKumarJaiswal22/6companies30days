/*
Goldman Sachs Problem-7

Solution by Aditya Kumar Jaiswal

Problem Statement: Find the position of M-th item(Find the Kid that gets damaged toy)
M items are to be delivered in a circle of size N. 
Find the position where the M-th item will be delivered if we start from a given position K. 
Note that items are distributed at adjacent positions starting from K.

Solution is in java language
*/

public class Problem7 {
	static int lastPosition(int n, int m, int k)
	{
        if (m <= n - k + 1)
		    return m + k - 1;

		m = m - (n - k + 1);

		return (m % n == 0) ? n : (m % n);
	}

	public static void main(String arg[])
	{
		int n = 5;
		int m = 8;
		int k = 2;
		System.out.print(lastPosition(n, m, k));
	}
}
