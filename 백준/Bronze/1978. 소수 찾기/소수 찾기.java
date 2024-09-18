import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			boolean check = true;
			for (int j = 2; j < a; j++) {
				if(a%j==0) {
					check=false;
					break;
				}
			}
			if(check&&a!=1) {
//				list.add(a);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
