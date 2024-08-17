import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t  < T+1; t ++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int[] A = sharprev(p);
			int[] B = sharprev(q);
			int[] result = new int[2];
			for (int i = 0; i < result.length; i++) {
				result[i] = A[i]+B[i];
			}
			System.out.printf("#%d %d\n",t,sharp(result));
			
		}
	}
	
	static int sharp(int[] arr) {
		int count = arr[0]+arr[1]-1;
		int total = count*(count+1)/2;
		return total-(arr[1]-1);
	}
	static int sharp1(int x, int y) {
		int count = x+y-1;
		int total = count*(count+1)/2;
		return total-(y-1);
	}
	static int[] sharprev(int p){
		int count = 0;
		while(true) {
			count++;
			if(count*(count+1)/2>=p) {
				break;
			}
		}
		int total = count*(count+1)/2;
		int x = count;
		int locationsum = count+1;
		int y = 1;
		// x+y = count;
		while(true) {
			if(total==p) {
				break;
			}
			x--;
			y++;
			total--;
		}
//		System.out.println("x="+ x);
//		System.out.println("y="+ y);
		int[] arr = {x,y};
		return arr;
	}

}
