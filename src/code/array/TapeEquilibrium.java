package code.array;

/**
 * 
 * Find index in an array with difference with between left and right part
 * @author pankajmishra
 *
 */
public class TapeEquilibrium {

    private int solution(int[] input) {
        long totalSum = 0;
        for (int i = 1; i < input.length; i++) {
            totalSum += input[i];
        }
        long mindiff = 0;
        long tempdiff = 0;
        long part1 = 0, part2;
        part1 += input[0];
        part2 = totalSum;
        mindiff = Math.abs(part1 - part2);        
        for (int i = 1; i < input.length-1; i++) {
            part1 += input[i];
            part2 -= input[i];
            tempdiff = Math.abs(part1 - part2);
            if (tempdiff < mindiff) {
                mindiff = tempdiff;
            }            
        }
        return (int) mindiff;
    }
    
    public static void main(String[] args) {
		int[] input = {3,1,2,4,3};
		TapeEquilibrium obj =new TapeEquilibrium();
		int minDiff= obj.solution(input);
		System.out.println(minDiff);
	}
}