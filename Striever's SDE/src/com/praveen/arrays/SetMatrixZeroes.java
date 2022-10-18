package com.praveen.arrays;

/*
Given a m*n matrix, if an element is 0, set its entire row and column to 0.

Examples 1:

Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output: [[1,0,1],[0,0,0],[1,0,1]]

Explanation: Since matrix[2][2]=0.
Therefore the 2nd column and 2nd row will be set to 0.

Examples 2:
 
Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. 
Therefore 1st row, 1st column and 4th column will be set to 0

*/
public class SetMatrixZeroes {

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1, 5 }, { 1, 0, 1, 5 }, { 1, 1, 1, 5 } };

		setMatrixZero(arr);
	}

	public static void setMatrixZero(int[][] arr) {

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
