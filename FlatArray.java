import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FlatArray
	{                                
	public static Integer[] flat(Object[] arr) throws IllegalArgumentException
		{
			if (arr == null) return null;
        		List<Integer> list = new ArrayList<Integer>();
	        	for (Object e : arr) 
			{
            			if (e instanceof Integer) 
				{
                			list.add((Integer) e);
            			} 
				else if (e instanceof Object[])
				{
                			list.addAll(Arrays.asList(flat((Object[]) e)));
            			}
				else
				{
                			throw new IllegalArgumentException("Input should be nested list ");
            			}
        		}
        	return list.toArray(new Integer[list.size()]);
    		}
	}

