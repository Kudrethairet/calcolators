package calculator;

import java.util.Scanner;

public class calculatorEngine {
	Addision ad = new Addision();
	Division dv = new Division();
	Substraction sb = new Substraction();
	Multiplize ml = new  Multiplize();
	String text1 = null;
	Scanner sc = null;
	/*public void Useranalysis()
	{
		

		calculatorz(text1, sc);
				
		
	}
	*/
	
	public void calculatorz(String text)
	{
		/*text1 = text;
		sc = scanner;*/
		if(text.contains("+"))
		{
			ad.additionOperater(text);
		}
		else if(text.contains("-"))
		{
			sb.subOperater(text);
		}
		else if(text.contains("*")){
			ml.multiplyOperater(text);
		}
		else if(text.contains("/")){
			dv.DividingOperater(text);
		}
		/*else{
			System.out.println("Please enter valid number");
			System.out.println("Please Enter a numbers");
			text = scanner.nextLine();
			Useranalysis();
			
		}*/
	}
}
