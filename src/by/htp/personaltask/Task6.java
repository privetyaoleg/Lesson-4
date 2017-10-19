package by.htp.personaltask;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
			int[][] array = new int[6][6];
			Scanner sc = new Scanner(System.in);
		
		  
		
		   for(int i=0; i<array.length; i++) { 
		     for(int j=0; j<array[i].length; j++) {
		       array[i][j] = (int)(Math.random()*15);
		     }
		   }
		   
		   printArray(array);
		   
			System.out.print("Enter you number = ");
			int number = sc.nextInt();
		   
		   int count = 0;
		   for(int i=0; i<array.length; i++) { 
			     for(int j=0; j<array[i].length; j++) {
			    	 if(array[i][j] == number){
			    		 count++;
			    	 }
			     }
			  }
		   
		   System.out.print("Counter = " + count);
		   
		   

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
