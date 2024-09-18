import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int count = 0;
		int first = V-A;
		int second = A-B;
		if(first<=0) {
			count++;
			System.out.println(count);
		} else {
			count++;
			if(first%second==0) {
				count+=first/second;
			} else {
				count+=first/second+1;
			}
			System.out.println(count);
		}
	}

}
