import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [5];
		System.out.println("Enter array:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After bubble sort:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
