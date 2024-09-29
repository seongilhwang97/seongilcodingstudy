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
		dp[0] = 1;
		for (int i : arr) {
			for (int j = i; j <= k; j++) {
				dp[j] += dp[j-i];
			}
		}
		System.out.println(dp[k]);
	}

}
