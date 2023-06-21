import java.util.Scanner;
public class Matadd
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the row and col of first matrix");
		Integer r1=obj.nextInt();
		Integer c1=obj.nextInt();
		System.out.println("Enter the row and col of second matrix");
		Integer r2=obj.nextInt();
		Integer c2=obj.nextInt();
		int a[][]=new int[r1][c1];
		int c[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int i,j;
		System.out.println("enter elements to first array");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter elements to second array");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("Printing 2d first Matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	

        System.out.println("Printing 2d second Matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		if(r1==r2 && c1==c2)
		{
			for(i=0;i<r1;i++)
			{
				for(j=0;j<r1;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("Printing ADDED MATRIX");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
				
	}
	else
	{
		System.out.println("NOT COMBATIBLE");
	}
	
}
}