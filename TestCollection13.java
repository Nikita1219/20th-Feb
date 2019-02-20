import java.util.*;

class TestCollection13
{
	public static void main(String [] args)

	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(11,"john");
		hm.put(12,"jim");
		hm.put(33,"mike");
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}