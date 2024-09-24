import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0&&h==0) {
				break;
			}
			map = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			visited = new boolean[h][w];
			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if(map[i][j]==1&&!visited[i][j]) {
						dfs(i,j);
						count++;
					}
				}
			}
			System.out.println(count);
			
		}

	}
	static int[][] map;
	static boolean[][] visited;
	static int w;
	static int h;
	// 상 하 좌 우 좌상 우상 좌하 우하
	static int[] dr = {-1,1,0,0,-1,-1,1,1};
	static int[] dc = {0,0,-1,1,-1,1,-1,1};
	static void dfs(int i, int j) {
		visited[i][j] = true;
		for (int d = 0; d < dc.length; d++) {
			int nr = i+dr[d];
			int nc = j+dc[d];
			if(nr>=0&&nr<h&&nc>=0&&nc<w&&!visited[nr][nc]&&map[nr][nc]==1) {
				dfs(nr,nc);
			}
		}
		
	}
}


