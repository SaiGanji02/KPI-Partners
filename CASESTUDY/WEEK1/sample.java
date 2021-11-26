import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sample {
	
	
	double TotalAmount= cal(500,4.5,6);
	void assertEquals(1250, TotalAmount);
	
	private double cal(int i, double d, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double balance(int amount,double rate,int year,int i)
	{
		double yearlyrate =amount*rate;
		double TotalAmount;
		
		System.out.print(amount + " :- " + " grows with the interest rate of " + rate);
		 for (i = 0; i <= year; i++ ){
		 }
			  
              TotalAmount = amount + yearlyrate;
              System.out.println(i + "   " + TotalAmount);
              
              return result;
	}

	
}



