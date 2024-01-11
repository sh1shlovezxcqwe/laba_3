import java.util.Scanner;

public class z1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double n, S = 0, m, i, x;
        System.out.print("Число n= ");
        n = in.nextDouble();
        System.out.print("Число m= ");
        m = in.nextDouble();
        System.out.print("Число x= ");
        x = in.nextDouble();
        for(i = 1; i <= n; i++){
            S += (Math.pow(x, 2*i-1) / fac(2*i-1));
        }
        System.out.println("" + S);
        double s = 0;
        for(i = 1; i <= n; i++){
            if ((Math.pow(x, 2*i-1) / fac(2*i-1)) <= m) {
                s += (Math.pow(x, 2 * i - 1) / fac(2 * i - 1));
            } else break;
        } System.out.println("" + s);
    }
    public static double fac(double n){
        double result = 1;
        for(double i = 1; i <= n; i++){
            result = result*i;
        }
        return result;
    }
}
