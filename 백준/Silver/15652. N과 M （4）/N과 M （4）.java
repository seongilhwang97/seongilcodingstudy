import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[M];
		visited = new boolean[N+1];
		sb = new StringBuilder();
		dfs(1,0);
		System.out.println(sb);
		
	}
	static int N;
	static int M;
	static int[] result;
	static boolean[] visited;
	static StringBuilder sb;
	static void dfs(int idx, int sidx) {
		if(sidx == M) {
			for (int i = 0; i < result.length; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
//		if(idx==N) {
//			return;
//		}
		
		for (int i = idx; i <= N; i++) {
//			if(!visited[i]) {
				result[sidx] = i;
				dfs(i,sidx+1);
//				visited[idx]=true;
//				dfs(idx+1,sidx);
//			}
			
		}
		
	}

}
