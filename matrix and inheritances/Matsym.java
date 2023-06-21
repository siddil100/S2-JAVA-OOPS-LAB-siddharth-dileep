import java.util.Scanner;
public class Matsym
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the row and col of first matrix");
		Integer r1=obj.nextInt();
		Integer c1=obj.nextInt();
		int a[][]=new int[r1][c1];
		int c[][]=new int[r1][c1];
		
		int i,j;
		System.out.println("enter elements to first array");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=obj.nextInt();
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
	

        
		int flag=1;

			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					c[i][j]=a[j][i];
					if(c[i][j]!=a[i][j])
			{
				flag=0;
			}					
			}
			}
			
			if(flag==1)
			{
				
			System.out.println("The matrix is a Symmetric Matrix");
			}
			else
			{
				System.out.println("The matrix is a Not a Symmetric Matrix");
			}
			
	
	
}
}