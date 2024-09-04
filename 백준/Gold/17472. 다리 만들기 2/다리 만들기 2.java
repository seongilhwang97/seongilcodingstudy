import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		check = new boolean[N][M];
		num = 0;
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				map[r][c] = sc.nextInt();
			}
		}
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if(map[r][c]==1&&!check[r][c]) {
					++num;
					bfs(r,c);
				}
			}
		}
		List<edge> edges = new ArrayList<edge>();
		// 가로 간
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if(map[r][c]!=0) {
					int count = 0;
					for (int c2 = c+1; c2 < M; c2++) {
						if(map[r][c2]==map[r][c]) {
							break;
						} else if(map[r][c2]==0) {
							count++;
						} else if(count>1&&map[r][c2]!=map[r][c]&&map[r][c2]!=0) {
							edges.add(new edge(map[r][c],map[r][c2],count));
							break;
						} else {
							break;
						}
					}
				}
			}
		}
		// 세로 간선
		for (int c = 0; c < M; c++) {
			for (int r = 0; r < N; r++) {
				if(map[r][c]!=0) {
					int count = 0;
					for (int r2 = r+1; r2 < N; r2++) {
						if(map[r2][c]==map[r][c]) {
							break;
						} else if(map[r2][c]==0) {
							count++;
						} else if(count>1&&map[r2][c]!=map[r][c]&&map[r2][c]!=0) {
							edges.add(new edge(map[r][c],map[r2][c],count));
							break;
						} else {
							break;
						}
					}
				}
			}
		}
		P = new int[num+1];
		for (int i = 1; i < P.length; i++) {
			P[i] = i;
		}
		Collections.sort(edges);
		int ans = 0;
		int pick = 0;
		for (int i = 0; i < edges.size(); i++) {
			if(findSet(edges.get(i).from)!=findSet(edges.get(i).to)) {
				union(edges.get(i).from,edges.get(i).to);
				ans += edges.get(i).w;
				pick++;
			}
			if(pick==num-1) {
				break;
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < P.length; i++) {
			set.add(findSet(i));
		}
		if(set.size()==1) {
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}
//		Collections.sort(edges, new Comparator<edge>() {
//
//			@Override
//			public int compare(edge o1, edge o2) {
//				// TODO Auto-generated method stub
//				return o1.w-o2.w;
//			}
//		});
//		System.out.println(Arrays.toString(P));
//		
//		
//		
//		for (int i = 0; i < edges.size(); i++) {
//			System.out.print(edges.get(i).from+" ");
//			System.out.print(edges.get(i).to+" ");
//			System.out.println(edges.get(i).w);
//		}
//		for (int[] a : map) {
//			System.out.println(Arrays.toString(a));
//		}
		
	}
	static int[] P;
	static int N;
	static int M;
	static int[][] map;
	static boolean[][] check;
	static int num;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	
	static int findSet(int x) {
		if(x!=P[x]) {
			P[x] = findSet(P[x]);
		}
		return P[x];
	}
	static void union(int x, int y) {
		P[findSet(y)] = findSet(x);
	}
	
	static void bfs(int r, int c) {
		check[r][c]=true;
		map[r][c] = num;
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if(nr>=0&&nr<N&&nc>=0&&nc<M&&map[nr][nc]==1&&!check[nr][nc]) {
				bfs(nr,nc);
			}
		}
		
	}

	
}
class edge implements Comparable<edge>{
	int from;
	int to;
	int w;
	public edge(int from, int to, int w) {
		super();
		this.from = from;
		this.to = to;
		this.w = w;
	}
	@Override
	public int compareTo(edge o) {
		// TODO Auto-generated method stub
		return this.w-o.w;
	}
}
