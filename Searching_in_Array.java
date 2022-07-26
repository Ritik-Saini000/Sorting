import java.util.Scanner;

public class Searching_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		int arr[]=new int[10];
		int i;
		System.out.println("enter array");
		Scanner sc =new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		//Linear Searching
//		int num=0,flag=0,pos=0;
//		System.out.println("enter no. to search");
//		num=sc.nextInt();
//		for(i=0;i<10;i++)
//		{
//			if(arr[i]==num)
//			{
//				flag=1;
//				pos=i;
//			}
//		}
//		if(flag==1)
//			System.out.println("found at pos:"+pos);
//		else
//			System.out.println("not found");
		
		//Binary Searching
		int start=0,mid,end=9,num,flag=0;
		System.out.println("Enter no. to search");
		num=sc.nextInt();
		
		for(i=0;i<10;i++)
		{
			mid=(start+end)/2;
			if(num<arr[mid])
			{
				end=mid-1;
			}
			else if(num>arr[mid])
			{
				start=mid+1;
			}
			else {
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
