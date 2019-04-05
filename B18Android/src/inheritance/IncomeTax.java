package inheritance;

public class IncomeTax {
	
	public int calculateTax(int annualIncome)
	{
		return annualIncome/10;
	}
	
	public int calculateTax(int annualIncome, int luxurySpending)
	{
		return ((annualIncome/10) + (luxurySpending/20));
	}
	

}
