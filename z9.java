import java.lang.Math;
import java.util.Scanner;

public class z9 {
    public static void main(String[] args) {
        double y = root_p(1.0e-4);
        System.out.println(y + " " + Math.pow(y, 3));
    }

    public static double root_p(double eps) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scan.nextDouble();
        System.out.println("Введите степень корня: ");
        double p = scan.nextDouble();
        double xp = 0.5 * x;
        double zp = 1.0 / p;
        while (true) {
            double xc = zp * ((p - 1) * xp + x / Math.pow(xp, p - 1));
            if (Math.abs(xc - xp) < eps) {
                return xc;
            }
            xp = xc;
        }
    }
}
