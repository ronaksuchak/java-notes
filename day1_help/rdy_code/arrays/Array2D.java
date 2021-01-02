package com.cdac.arrays;
public class Array2D
{
	public static void main(String[] args)
	{
		int[][] arr = new int[2][3];
		for( int i = 0; i < 2; ++ i )
		{
			for( int j = 0; j < 3; ++ j )
			{
				System.out.print(arr[ i ][ j ]+"	");				
			}
			System.out.println();
		}
	}
}
