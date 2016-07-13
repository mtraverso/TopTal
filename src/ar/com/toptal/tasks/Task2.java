package ar.com.toptal.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	 public int[] solution(int[] A) {
		 int sum = 0;
		 for(int i = 0; i< A.length; i++){
			 sum += A[i]*Math.pow(-2,i);
		 }
		 return convertToNegativeBase2(-sum);
	 }
	 
	 //By investigating how to convert to -2 base
	 public int[] convertToNegativeBase2(int value)
	 {
	     List<Integer> result = new ArrayList<Integer> ();
	     while (value != 0)
	     {
	         int remainder = value % -2;
	         value = value / -2;
	         if (remainder < 0)
	         {
	             remainder += 2;
	             value += 1;
	         }
	         result.add(remainder);
	     }
	     return toIntArray(result.toArray(new Integer[0]));
	 }
	 
	 private int[] toIntArray(Integer[] arr){
		 int[] result = new int[arr.length];
		 for(int i = 0; i<arr.length; i++){
			 result[i] = (arr[i].intValue());
		 }
		 return result;
	 }
	 
}
