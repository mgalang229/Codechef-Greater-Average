import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
			System.out.println(getAvg(a, b) > c ? "YES" : "NO");
		}
		scan.close();
	}
	
	static double getAvg(double x, double y) {
		return (x + y) / 2;
	}
}
