package Basics;

public class MDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{6,8,5},{3,0,7},{1,2,9}};
		int min= a[0][0];
		int mincol = 0;
		/*for(int i=0;i<3;i++)  // to find the minimum value in the array.
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				if(a[i][j]>min)
				    min=a[i][j];
				System.out.print(" ");
			}
			    System.out.println("");
		}*/
		
		for(int i=0;i<3;i++)      // to find the maximum value in the column of minimum value.
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				if(a[i][j]<min)
				{
				   min=a[i][j];
				   mincol=j;
				}
				System.out.print(" ");
			}
			    System.out.println("");
		}
		int max=a[0][mincol];
		int k=0;
		while(k<3)
		{
			if(a[k][mincol]>max)
				max=a[k][mincol];
			k++;
		}
		System.out.println(max);
	}

}
