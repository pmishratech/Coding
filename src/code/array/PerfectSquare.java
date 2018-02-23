package code.array;

class PerfectSquare {
	
	public static void main(String[] args) {
		PerfectSquare obj = new PerfectSquare();
		System.out.println(obj.solution(1000, 2000));
		System.out.println(obj.solution(9,9));
	}
    public int solution(int A, int B) {
    	//Return zero if there are no perfect squares
        if (B < 0 || B < A) return 0;

        //Reset the lower bound if needed
        if (A <= 0) A = 1;
        
    	return (int) (Math.floor(Math.sqrt(B)) -
                Math.ceil(Math.sqrt(A)) + 1);
    }
}