import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t < T+1; t++) {
			int N = sc.nextInt();
			int[][] result = new int[N][];
			int[] A = {1};
			int[] B;
			result[0] = A;
			for (int n = 1; n < N; n++) {
				B = new int[A.length+1];
				B[0] = 1;
				B[B.length-1] = 1;
				for (int i = 1; i < B.length-1; i++) {
					B[i] = A[i-1]+A[i];
				}
				result[n] = B;
				A = B;
			}
			System.out.printf("#%d\n", t);
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < result[r].length; c++) {
					System.out.print(result[r][c]+" ");
				}
				System.out.println();
			}
		}
	}

}
