package ch06;

public class Euclid2
{
	public static void main(String args[])
	{
		try
		{
			int a = 2701;
			int b = 222;
			// Only try to parse arguments if we have exactly 2
			if (args.length == 2)
			{
				try
				{
					a = Integer.parseInt(args[ 0 ]);
					b = Integer.parseInt(args[ 1 ]);
				}
				catch (NumberFormatException nfe)
				{
					System.err.println("Arguments were not both numbers.");
					System.err.println("Using defaults.");
				}
			}
			else
			{
				System.err.print("Wrong number of arguments");
				System.err.println(" (expected 2).");
				System.err.println("Using defaults.");
			}
			while (b != 0)
			{
				if (a > b)
				{
					a = a - b;
				}
				else
				{
					b = b - a;
				}
			}
			if (a == 1)
			{
				throw new GCDException("Denominator is 1 ", a, b, 44);
			}
			System.out.print("The GCD of " + a + " and " + b + " is ");
			System.out.println(a);
		}
		catch (GCDException e)
		{
			System.err.println(e.getMessage() + "with values " + e.getaFromPair() + " and " + e.getbFromPair() +
			                   " at: " + e.getLineNumber());
		}
	}
}

