package by.htp.personaltask;

import java.util.Arrays;


public class Task5 {

	public static void main(String[] args) {
		
		   int[][] array = new int[6][6];
		  
		
		   for(int i=0; i<array.length; i++) { 
		     for(int j=0; j<array[i].length; j++) {
		       array[i][j] = (int)(Math.random()*100);
		     }
		   }
		   
		   printArray(array);
		   
		   int[] maxValues = new int[6];
		   
		   int max = 0;
		   for(int j=0; j<array.length; j++) {
			   for(int i=0;i<array.length; i++){
				   if (max < array[i][j]) {
					   max = array[i][j];
				   }
			   }
			   maxValues[j] = max;
			   max = 0;
			   
		   }
		   
		   System.out.println("Max values of columns = " + Arrays.toString(maxValues));
		   
		   
		   

	}
	
	static void printArray (int[][] array) {
		
			for(int i=0; i<array.length; i++) { 
				for(int j=0; j<array[i].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("_____________________________");
		}

}
