import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int N = sc.nextInt();
         int x = 1;
         int count = 1;
         while(N > x) {
             x = x+6*count;
             count++;
         }
         System.out.println(count);
    }
}