package calculator;

public class Division {

	 
	
	public  void DividingOperater(String text)
	{
		
       String newString  = null;
		
		
			
			System.out.println("this is Division");
			//StringBuilder sb = new StringBuilder(text);
			//replace + wth space
			newString = text.replace("/", " ");
			String[] totals = newString.split(" ");
			String num1 = totals[0];
			String num2 = totals[1];
			int firstNum = Integer.parseInt(num1);
			int secondNum = Integer.parseInt(num2);
			int sum = firstNum/secondNum;
			System.out.println("Result is: "+sum);
		
		
	}
	
	
	
}
