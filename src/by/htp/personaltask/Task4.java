package by.htp.personaltask;

import java.util.Scanner;

class Task4 {
	
   public static void main(String[] args) {
     
	   
	   int[][] array = new int[6][5];
	   Scanner sc = new Scanner(System.in);
	
	   for(int i=0; i<array.length; i++) { 
	     for(int j=0; j<array[i].length; j++) {
	       array[i][j] = (int)(Math.random()*25);
	     }
	   }
	   
	   printArray(array);
	   
	   System.out.print("Enter row ¹1 = ");
	   int row1 = sc.nextInt()-1 ;
	   System.out.print("Enter row ¹2 = ");
	   int row2 = sc.nextInt()-1 ;
	
	     
	     int temp = 0;
	  
	     for(int i=0; i<array[i].length; i++) {
		      
		    	 temp=array[row1][i];
		    	 array[row1][i] = array[row2][i];
		    	 array[row2][i] = temp;
		    	
		     }
		
	     printArray(array); 
	   
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


