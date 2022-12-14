import java.util.Scanner;
class Circle4 {
	private double x, y;
	private int radius;
	
	public Circle4(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
	public int getRadius() {
		return radius;
	}
}

public class HW_Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle4 c[] = new Circle4[3];
		int max = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle4(x, y, radius);
		}
		
		for (int i = 0; i < c.length; i++)
			if (max < c[i].getRadius())
				max = c[i].getRadius();
		for (int i = 0; i < c.length; i++)
			if (max == c[i].getRadius()) {
				System.out.print("가장 면적이 큰 원은 ");
				c[i].show();
			}
		scanner.close();
	}

}
