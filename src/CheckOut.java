import java.math.BigDecimal;
import java.text.NumberFormat; 
import java.util.List;

import static java.util.Collections.frequency;



public class CheckOut extends Transformer 
   
  {
	
		private static final int APPLE_PRICE = 60;
		private static final int ORANGE_PRICE = 25;
		private static final String APPLE = "apple";
		private static final String ORANGE = "orange";

   public CheckOut(Transformer transformer)
	{
	   
	}
	
	public String printReceipt(List<String> cart) 
	
	{
		BigDecimal total = new BigDecimal(scanCart(cart) * 0.01);
		return NumberFormat.getCurrencyInstance().format(total);
	}
	
	private int scanCart(List<String> cart) 
	
	{
	
		int total = 0;
		int apples = frequency(cart, APPLE);
		int totalApplePrice = apples * APPLE_PRICE;
		total += totalApplePrice;
		
		int oranges = frequency(cart, ORANGE);
		int orangeTotalPrice = oranges * ORANGE_PRICE;
		total += orangeTotalPrice;
		return total;
	}

}
