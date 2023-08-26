import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
	
	public static void main (String[] args)
	{
		int[] ar = {2,3,5,6};
		for (int s:ar) {
		System.out.print(s+" ");
			
		}
		String[] a= {"coreJava", "Selenium", "Appium"};
		List<String> b = Arrays.asList(a);
		System.out.println(b.contains("Selenium"));
		
		
		System.out.println(" ");
		
		
			ArrayList <String> name = new  ArrayList<String> ();
			name.add("vamshi");
			name.add("rahul");
			name.add("rohit");
			name.add("vinod");
			System.out.println(name.contains("vamshi"));
			
			System.out.println(name.get(0));
			System.out.println(name.get(3));
			for(String r:name)
			{
				System.out.println(r);
			}
	
			
	}

}
