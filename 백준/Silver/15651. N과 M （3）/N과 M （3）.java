import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[M];
		sb = new StringBuilder();
		dfs(0);
		System.out.println(sb);
		
	}
	static int N;
	static int M;
	static int[] result;
	static StringBuilder sb;
	static void dfs(int idx) {
		if(idx == M) {
			for (int i = 0; i < result.length; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			result[idx] = i;
			dfs(idx+1);
		}
		
	}

}
