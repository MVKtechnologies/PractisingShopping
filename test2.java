
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("hello world");


for(int i =7; i>=1;i--) {
	for(int j=7; j>i;j--) {
		System.out.print(" ");
	}
	for(int  k=7; k<(i*2);k++) {
		if (k>7 && k<(i*2)-1) {
			System.out.print(" ");
		}
		else 
	{
			System.out.print("*");
		}

	}
	System.out.println();

	}
	}

}
