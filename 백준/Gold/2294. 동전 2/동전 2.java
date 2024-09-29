import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[k+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for (int i : arr) {
			for (int j = i; j <= k; j++) {
				if(dp[j-i]!=Integer.MAX_VALUE) {
					dp[j] = Math.min(dp[j], dp[j-i]+1);
				}
			}
		}
		if(dp[k]!=Integer.MAX_VALUE) {
			System.out.println(dp[k]);
		} else {
			System.out.println(-1);
		}
	}

}
