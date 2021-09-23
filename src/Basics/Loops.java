package Basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<8;i++)
		{
			if(i==1)
			System.out.print("   ");
			if(i==2)
				System.out.print("  ");
			if(i==3)
				System.out.print(" ");
			if(i==5)
				System.out.print(" ");
				if(i==6)
					System.out.print("  ");
				if(i==7)
					System.out.print("   ");
			if(i<5)
			{
				for(int j=1;j<=i ;j++ )
				{	
					
					System.out.print("*");
					System.out.print(" ");
				
				}
			}
			else
			{
				for(int k=1;k<=8-i;k++)
				{
					
					System.out.print("*");
					System.out.print(" ");
				}
			}
		/*int k=1;
		for(int i=1;i<4;i++)
		{
	
			for(int j=1;j<=i;j++)
			{
				//int m =k*3;
				System.out.print(k*3);
				System.out.print(" ");
				k++;
			}*/
			System.out.println("");
			
		}

	}

}
