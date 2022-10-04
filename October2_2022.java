package projectOnboarding;

import java.util.Scanner;

public class October2_2022 {
	public static boolean validatePIN(String pin)
	{
		if (pin.length()!=4 && pin.length()!=6) {return false;}
		else 
		{
			boolean result = true; 
			for (int i=0;i<pin.length();i++) 
				{if (pin.charAt(i)<48 || pin.charAt(i)>57) result = false;}
			return result;
		}
	}
	
	public static boolean validateFactorial(int a)
	{
		if (a<1) {return false;}
		else 
		{
			int factCheck = 1;
			int iteration = 1;
			while (factCheck<a) {factCheck*=iteration; iteration++;}
			if (factCheck==a) {return true;}
			else {return false;}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String pin = sc.next();
		int factorial = sc.nextInt();
		
		System.out.println(validatePIN(pin)+" "+validateFactorial(factorial));
		sc.close();
	}
}
