	public class z3 {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(prois());
        System.out.println(sumpro());
    }
    public static int sum (){
        int result = 0;
        for (int i = 1; i <= 8; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += (j + i) * (j + i);
            }
            result += sum;
        }
        return result;
    }
    public static int prois (){
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            int pro = 1;
            for (int j = 1; j <= i; j++) {
                pro *= j;
            }
            result *= pro;
        }
        return result;
    }
    public static int sumpro (){
        int result = 1;
        for (int i = 1; i <= 8; i++) {
            int sigmaInner = 0;
            for (int j = 1; j <= 2*i-1; j++) {
                int sigmaInnerInner = 0;
                for (int k = i+j; k <= 2*(i+j); k++) {
                    sigmaInnerInner += (2*j - 3*(i-0.5*k));
                }
                sigmaInner += sigmaInnerInner;
            }
            result *= sigmaInner;
        }
        return result;
    }
}
