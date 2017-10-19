package by.htp.personaltask;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter size of your array: ");
			int size = sc.nextInt();
			int[] array = new int[size];
			
			for (int i=0; i<array.length;i++){
				array[i]=(int)(Math.random()*100);
			}
			
			System.out.println(Arrays.toString(array));
			System.out.println("MAX = " + findMax(array));
			divisionMax(findMax(array), array);
			
			
			
		}
		
		static int findMax (int[] array) {
			
			int max = array[0];
			
			for (int i = 0; i < array.length; i++){
				if (max < array[i]){
					max = array[i];
				
				}
				
			}
			return max;
		}
		
		static void divisionMax (int max, int[]array){
			double[] array2 = new double[array.length];
			for (int i=0; i<array.length; i++) {
				array2[i]=array[i]/(double)max;
				
			}
			System.out.println(Arrays.toString(array2));
		}
		
}
