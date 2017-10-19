package by.htp.personaltask;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// 1. ¬ массиве найти минимальный и максимальный элементы, помен€ть их местами.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of your array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for (int i=0; i<array.length;i++){
			array[i]=(int)(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(array));
	
		changeElements(findMax(array), findMin(array), array);
	

	}
	
	static int findMax (int[] array) {
		int indexOfMax = 0;
		int max = array[0];
		
		for (int i = 0; i < array.length; i++){
			if (max < array[i]){
				max = array[i];
				indexOfMax = i;
			}
			
		}
		return indexOfMax;
	}
	
	static int findMin (int[] array) {
		
		int indexOfMin = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++){
			if (min > array[i]){
				min = array[i];
				indexOfMin = i;
			}
			
		}
		return indexOfMin;
	}
	
	static void changeElements (int a, int b, int[]array) {
		int temp = 0;
		temp = array[a];
		array[a]=array[b];
		array[b]=temp;
		System.out.println(Arrays.toString(array));
		
	}

}
