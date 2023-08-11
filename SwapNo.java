
import java.util.*;

class SwapNo {


	static void swapValuesUsingThirdVariable(int m, int n)
	{
		// Swapping the values
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}


	public static void main(String[] args)
	{
		// Random integer values
		int m = 9, n = 5;


		swapValuesUsingThirdVariable(m, n);
	}
}
