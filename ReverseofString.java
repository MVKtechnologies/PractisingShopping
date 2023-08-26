

public class ReverseofString {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		String s= "Learning core java";
		String[] split=s.split("core");
		System.out.println(split[1]);
		System.out.println(split[1].trim());
		//System.out.println(s.length());
		
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
		
	}

}


