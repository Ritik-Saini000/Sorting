import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter matrix 1");
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix 2");
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<j;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Matrix after cross multiplication:");
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]);
			}
		}
	}

}
