import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 모든 사람이 왼쪽을 썼을 때를 가정하고 결과 구하고 +1
		// LL LL LL
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] arr = new char[N];
		String input = sc.next();
		for (int i = 0; i < N; i++) {
			arr[i] = input.charAt(i);
		}
		
		// 인원 수
		int total = arr.length;
		// 이용 못하는 인원 수
		int loser = 0;
		int solo = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 'L') {
				loser++;
			}
			if(arr[i] == 'S') {
				solo++;
			}
		}
		int result = 0;
		result = total - (loser/2);
		if (loser !=0) {
			result+=1;
		}
		System.out.println(result);
	}
	

}
