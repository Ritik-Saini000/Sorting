
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=124;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse number="+rev);
	}

}
