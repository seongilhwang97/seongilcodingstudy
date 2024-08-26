import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학점의 총합
		double sum = 0;
		//전공과목별합(학점*과목평점)
		double msum = 0;
		for (int i = 0; i < 20; i++) {
			String a = sc.next();
			double b = sc.nextDouble();
			String c = sc.next();
			double d = 0;
			if(!c.equals("P")) {
				sum+=b;
				if(c.equals("A+")) {
					d = 4.5;
				} else if(c.equals("A0")) {
					d = 4.0;
				} else if(c.equals("B+")) {
					d = 3.5;
				} else if(c.equals("B0")) {
					d = 3.0;
				} else if(c.equals("C+")) {
					d = 2.5;
				} else if(c.equals("C0")) {
					d = 2.0;
				} else if(c.equals("D+")) {
					d = 1.5;
				} else if(c.equals("D0")) {
					d = 1.0;
				} else if(c.equals("F")) {
					d = 0.0;
				}
				msum+=b*d;
			} 
		}
		System.out.println(msum/sum);
	}

}
