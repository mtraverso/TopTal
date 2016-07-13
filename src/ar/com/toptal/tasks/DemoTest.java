package ar.com.toptal.tasks;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {
	public int solution(int[] A) {
		int sum = 0;
		for (int i = 1; i < A.length; i++) {
			sum = sum + A[i-1];
			int sumPending = 0;
			for (int j = i + 1; j < A.length; j++) {
				sumPending += A[j];
			}
			if (sum == sumPending) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		DemoTest test = new DemoTest();
		int[] A = new int[8];
		A[0] = -1;
		A[1] = 3;
		A[2] = -4;
		A[3] = 5;
		A[4] = 1;
		A[5] = -6;
		A[6] = 2;
		A[7] = 1;
		System.out.println(test.solution(A));
	}

}
