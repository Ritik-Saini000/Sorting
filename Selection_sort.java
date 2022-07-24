
import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [5];
		System.out.println("enter array:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("Array after selection sort:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}

}
