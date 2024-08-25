
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[][] map = new String[N][N];
		for (int i = 0; i < map.length; i++) {
			map[i] = sc.next().split("");
		}
		String[][] result = new String[N][N];
		
		int d = 0;
		//상 하 좌 우 우상 좌상 우하 좌하 
		int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
		int[] dc = {0, 0, -1, 1, 1, -1, 1, -1};
		
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				d = 0;
				int count = 0;
				if(map[r][c].equals(".")) {
					
					for (d = 0; d < dc.length; d++) {
						int nr = r+dr[d];
						int nc = c+dc[d];
						if(nr>=0&&nr<N&&nc>=0&&nc<N&&!map[nr][nc].equals(".")) {
							count+=Integer.parseInt(map[nr][nc]);
						}
					}
					if(count<10) {
						result[r][c] = Integer.toString(count);
					} else {
						result[r][c] = "M";
					}
				} else {
					result[r][c] = "*";
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
