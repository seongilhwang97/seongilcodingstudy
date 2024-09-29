import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] dp = new int[N+1][3];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			dp[i] = new int[]{a,b,c};
		}
		for (int r = 1; r < N+1; r++) {
			for (int c = 0; c < 3; c++) {
				PriorityQueue<Integer> pq = new PriorityQueue<>();
				for(int k = 0; k<3;k++){
					if(k!=c)
					pq.add(dp[r][c]+dp[r-1][k]);
				}
				if(!pq.isEmpty())
				dp[r][c] = pq.poll();
			}
		}
		int a = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if(dp[N][i] < a) {
				a = dp[N][i];
			}
		}
		System.out.println(a);
		
//		for (int[] is : dp) {
//			System.out.println(Arrays.toString(is));
//		}
		
	}
	
}


