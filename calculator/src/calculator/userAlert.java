package calculator;

public class userAlert {

	ScannerFun sf = new ScannerFun();
	calculatorEngine ce = new calculatorEngine();
	//Addision ad = new Addision();
	//Useranalysis us = new Useranalysis();
	//Scanner scanner = new  Scanner(System.in);
	/*public void ScannerFun (Scanner scanner)
	{
		this.scanner = sf.scanner;
	}*/
	public void enter_number()
	{
		
		System.out.println("Please Enter a numbers");
		sf.User_Scanner();
		Useranalysis();
		//ce.Useranalysis();
		//System.out.println(sf.userText);
		//System.out.println(sf.userText());
	}
	
	
	public String userEntry()
	{
		String text = null;
		text = sf.userText;
		return text;
	}
	
	
	public void Useranalysis()
	{
		

		getAnswer();
				
		
	}
	

	
	
	public void getAnswer()
	{
		
		ce.calculatorz(userEntry());
		
			

	
	}
	
}
