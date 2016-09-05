import java.util.List;
import java.util.ArrayList;

public class Transformer 

 {
	
	public List<String> items(List<String> itemNames)
	
	{
		List<String> itemList = new ArrayList<String>();
		
		for (String name : itemNames) 
		
		{
			itemList.add(name.toLowerCase());
		}
			
		return itemList;
	}
	
	
		
		
 }


