package ar.com.toptal.tasks;

public class Task3 {
	public int solution(int A, int B){
	    int diff = A-B;
	    if(B>diff){
	        return 2*((B-diff)/3)+diff;
	    }else{
	        return diff-2*((diff-B)/4);
	    }
	}
	
	public static void main(String[] args) {
		Task3 t3 = new Task3();
		System.out.println(t3.solution(4, 5));
	}
	
}
