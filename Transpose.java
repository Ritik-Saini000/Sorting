import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][]=new int [3][3];
		System.out.println("enter 2d matrix");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
		    System.out.print("[");
		    for (int j = 0; j < matrix[0].length; j++) {
		        System.out.print(matrix[i][j] + ",");
		    }
		    System.out.print("]\n");
		}
		System.out.println("\n");
		
		for (int i = 0; i < 3; i++) {
		    for (int j = i; j < 3; j++) {
		        int temp = matrix[i][j];
		        matrix[i][j] = matrix[j][i];
		        matrix[j][i] = temp;
		    }
		}
		

		for (int i = 0; i < matrix.length; i++) {
		    System.out.print("[");
		    for (int j = 0; j < matrix[0].length; j++) {
		        System.out.print(matrix[i][j] + ",");
		    }
		    System.out.print("]\n");
		}
	}

}
