import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean[][] visited;
	static char[][] map;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new char[N][];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			map[i] = input.toCharArray();
		}
		int normal = 0;
		int abnormal = 0;
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				if(map[r][c]=='R'&&!visited[r][c]) {
					dfs(r,c,'R');
					normal++;
				} else if(map[r][c]=='G'&&!visited[r][c]) {
					dfs(r,c,'G');
					normal++;
				} else if(map[r][c]=='B'&&!visited[r][c]){
					dfs(r,c,'B');
					normal++;
				}
			}
		}
		visited = new boolean[N][N];

		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				if((map[r][c]=='R'||map[r][c]=='G')&&!visited[r][c]) {
					dfs2(r,c,'R','G');
					abnormal++;
				} else if(map[r][c]=='B'&&!visited[r][c]){
					dfs(r,c,'B');
					abnormal++;
				}
			}
		}
		System.out.println(normal+" "+abnormal);
		
	}
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static void dfs(int r, int c, char a) {
		visited[r][c] = true;
		for (int d = 0; d < dc.length; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0&&nr<N&&nc>=0&&nc<N&&!visited[nr][nc]&&map[nr][nc]==a) {
				dfs(nr,nc,a);
			}
		}
		
	}
	static void dfs2(int r, int c, char a, char b) {
		visited[r][c] = true;
		for (int d = 0; d < dc.length; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0&&nr<N&&nc>=0&&nc<N&&!visited[nr][nc]&&(map[nr][nc]==a||map[nr][nc]==b)) {
				dfs2(nr,nc,a,b);
			}
		}
		
	}
}


