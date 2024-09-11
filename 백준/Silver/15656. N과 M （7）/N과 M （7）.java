import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		result = new int[M];
		visited = new boolean[N+1];
		sb = new StringBuilder();
		dfs(0);
		System.out.println(sb);
		
	}
	static int N;
	static int M;
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	static StringBuilder sb;
	static void dfs(int idx) {
		if(idx == M) {
			for (int i = 0; i < result.length; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			result[idx] = arr[i];
			dfs(idx+1);
				
		}
		
	}

}
