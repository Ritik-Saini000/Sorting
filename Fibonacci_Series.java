import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0,second=1,next;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of terms to be printed");
		int num=sc.nextInt();
		System.out.println("Fibonacci Series");
		for(int i=0;i<num;i++) {
			System.out.print(first+"\t");
			next=first+second;
			first=second;
			second=next;
		}
		
	}

}
