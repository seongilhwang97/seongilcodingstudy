import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			// 사각형 1의 좌하
			int x1 = sc.nextInt();
			// 사각형 1의 좌하
			int y1 = sc.nextInt();
			// 사각형 1의 우상
			int p1 = sc.nextInt();
			// 사각형 1의 우상
			int q1 = sc.nextInt();
			// 사각형 2의 좌하
			int x2 = sc.nextInt();
			// 사각형 2의 좌하
			int y2 = sc.nextInt();
			// 사각형 2의 우상
			int p2 = sc.nextInt();
			// 사각형 2의 우상
			int q2 = sc.nextInt();
			
			// 공통부분 없음 = d
			if(x2>p1||p2<x1||y2>q1||q2<y1) {
				System.out.println("d");
				continue;
			}
			
			// 점이 만남 = c
			else if(((p1==x2)&&(q1==y2))||((p1==x2)&&(y1==q2))||((x1==p2)&&(y1==q2))||((x1==p2)&&(q1==y2))) {
				System.out.println("c");
				continue;
			}
			// 선분 = b??
			else if((q1==y2)||(y1==q2)||(p1==x2)||(p2==x1))
					{
				System.out.println("b");
				continue;
			}
			// 직사각형 = a
			else {
				System.out.println("a");
			}
		}
	}
}
