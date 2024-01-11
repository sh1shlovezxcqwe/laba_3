	public class z8 {
    public static void main(String args[]) {
        FunctionMy functionMy = new FunctionMy();

        for (int i = 0; i < 10; i++) {
            System.out.println("Результат " + (i+1) + ": " + functionMy.calculate(i));
        }
    }
}

class FunctionMy {
    public double calculate(int param) {
        double a = 2.0;
        double b = 3.0;
        double result = ((Math.sqrt(Math.pow((3+param), 6) +Math.log(Math.abs(param-Math.sqrt(a*param*Math.pow(b, 3)))))) + Math.pow((Math.atan(a-Math.pow(param, 5))), 4))/ (Math.pow((Math.exp(1)), Math.pow(Math.exp(1), param+1)) - Math.sqrt(Math.abs(Math.pow(Math.cos(Math.abs(-param+5)), 2))));
        return result;
    }
}
