package com.deeps;

public class Array2D {

	public static void main(String[] args) {
		int[][]  arr2d = {
				{1,2,3},
				{4,5,6},
				{7,8,9}				
		};
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.println(arr2d[i][j] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("*********************");
		int[][]  jaggedArray = new int[3][];
		
		jaggedArray[0] = new int[] {10,11,12};
		jaggedArray[1] = new int[] {13,14};
		jaggedArray[2] = new int[] {15,16,17,18};
		
		for(int i=0;i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.println(jaggedArray[i][j] + "   ");
			}
			System.out.println(" ");
		}
		
		
	}

}
