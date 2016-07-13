package ar.com.toptal.tasks;

public class Task1 {
	public  int solution(int X, int[] A) {
		int countX = 0;
		int countY = 0;
		int result= 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == X){
				countX++;
			}
		}
		for(int j = A.length-1; j>=0; j--){
			if(A[j] != X){
				countY++;
			}
			if(A[j] == X){
				countX--;
			}
			if(countX == countY){
				result = j;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		int[] A = new int[7];
		A[0] = 5;
		A[1] = 5;
		A[2] = 1;
		A[3] = 3;
		A[4] = 2;
		A[5] = 3;
		A[6] = 5;
		
		System.out.println(task1.solution(5,A));
	}
}
