import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		map = new int[M][N];
		visited = new boolean[M][N];
		q = new PriorityQueue<>();
		for (int i = 0; i < K; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for (int r = y1; r < y2; r++) {
				for (int c = x1; c < x2; c++) {
					visited[r][c] = true;
				}
			}
		}
		int count = 0;
		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				if(!visited[r][c]) {
					area = 0;
					dfs(r,c);
					count++;
					q.add(area);
				}
			}
		}
		System.out.println(count);
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		
	}
	private static void dfs(int r, int c) {
		visited[r][c] = true;
		area++;
		for (int d = 0; d < dc.length; d++) {
			int nr = r+dr[d];
			int nc = c + dc[d];
			if(nr>=0&&nr<M&&nc>=0&&nc<N&&!visited[nr][nc]) {
				dfs(nr,nc);
			}
		}
		
		
	}
	static int M;
	static int N;
	static int K;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static PriorityQueue<Integer> q;
	static int area;

	

}
