import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			// 물건의 무게
			arr[i][0] = sc.nextInt();
			// 물건의 가치
			arr[i][1] = sc.nextInt();
		}
//		Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				return o1[0]-o2[0];
//			}
//		});
		int[] dp = new int[K+1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = dp.length-1; j >= 0; j--) {
				if(j>=arr[i][0]) {
					dp[j] = Math.max(dp[j], dp[j-arr[i][0]]+arr[i][1]);
				}
				
			}
		}
		
//		System.out.println(Arrays.toString(dp));
//		
//		for (int[] i : arr) {
//			System.out.println(Arrays.toString(i));
//		}
		System.out.println(dp[K]);
	}

}
