package eDiez;

import java.util.Arrays;

class EDiez {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		int[] array2 = {5,6,7,8,9};
		
		int[] array3 = new int[array.length + array2.length];
		
		
		for (int i = 0; i < array.length; i++) {
			
			array3[i]= array[i];
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			array3[array.length + i]= array2[i];
			
		}
		
		System.out.println("Array fusionado:" + Arrays.toString(array3));
	}

}
