import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[10];
		
		System.out.println("enter array");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=1; i<arr.length; i++) {
	           int current = arr[i];
	           int j = i - 1;
	               while(j >= 0 && arr[j] > current) {
	                   //Keep swapping
	                   arr[j+1] = arr[j];
	                   j--;
	               }
	           arr[j+1] = current;
	       }

		System.out.println("array after insertion sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
