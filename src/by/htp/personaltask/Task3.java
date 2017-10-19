package by.htp.personaltask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 { // Дан массив A вещественного типа, содержащий 20 положительных и отрицательных элементов. 
	   // Сформировать массив B из положительных элементов массива A, имеющих четный индекс. Найти сумму квадратов элементов нового массива.

		public static void main(String[] args) {
		
			int size = 20;
			int[] array = {24, -3, 15, 2, -15, 25, -9, 12, 98, -123, 23, 12, - 23, -2, 6, -12, 98, 23, 13, 22};
			
			System.out.println(Arrays.toString(array));
			int size2 = 0;
			
			for (int i = 0; i < array.length; i=i+2){
				if (array[i] > 0){
					size2++;
				}
			}
			
			
			int[] possitiveArray = new int[size2];
			int count = 0;
			
			for (int i = 0; i < array.length; i=i+2) {
				
				if (array[i] > 0){
					possitiveArray[count]=array[i];
					count++;
				
				}
			}
			
			int result = 0;
			for (int i = 0; i < possitiveArray.length; i++){
				result = result + ( possitiveArray[i]*possitiveArray[i]);
			}
			
			
			System.out.println(Arrays.toString(possitiveArray));
			System.out.println(result);

			
	}

}
