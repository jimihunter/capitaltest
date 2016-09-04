import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CheckoutTester {

	@Test
	public void testPrintReceipt() {
		List<String> itemNames = new ArrayList<String>();
		List<String> resultItems = new ArrayList<String>();
		Collections.addAll(itemNames, "Orange","Apple","Orange","Apple");
			
	      Transformer transformer = new Transformer();
	      CheckOut checkout = new CheckOut(transformer);
	      resultItems = checkout.items(itemNames);
	      String receipt = checkout.printReceipt(resultItems);
	      assertNotEquals("£1.10", receipt);
	      
		
	}
	
	@Test
	public void testPrintReceipt1() {
		List<String> itemNames = new ArrayList<String>();
		List<String> resultItems = new ArrayList<String>();
		Collections.addAll(itemNames, "Orange","Orange","Orange","Apple");
			
	      Transformer transformer = new Transformer();
	      CheckOut checkout = new CheckOut(transformer);
	      resultItems = checkout.items(itemNames);
	      String receipt = checkout.printReceipt(resultItems);
	      assertEquals("£1.35", receipt);
		
	}
	
	@Test
	public void testPrintReceipt2() {
		List<String> itemNames = new ArrayList<String>();
		List<String> resultItems = new ArrayList<String>();
		Collections.addAll(itemNames, "Apple");
			
	      Transformer transformer = new Transformer();
	      CheckOut checkout = new CheckOut(transformer);
	      resultItems = checkout.items(itemNames);
	      String receipt = checkout.printReceipt(resultItems);
	      assertEquals("£0.60", receipt);
		
	}
	

}
