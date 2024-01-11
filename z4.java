import java.util.Scanner;

public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите десятичную дробь: ");
            String input = scanner.nextLine();
            if (input.contains(".")) {
                double decimalFraction = Double.parseDouble(input);
                if (decimalFraction % 1 == 0) {
                    System.out.println("Ошибка: введена дробь с целой частью");
                    continue;
                }

                System.out.println("Введите основание системы счисления (больше 1): ");
                int base = scanner.nextInt();

                if (base <= 1) {
                    System.out.println("Ошибка: основание системы счисления должно быть больше 1");
                    continue;
                }

                String result = Integer.toString((int) decimalFraction, base) + ".";
                double fraction = decimalFraction - (int) decimalFraction;

                while (fraction != 0) {
                    fraction *= base;
                    int digit = (int) fraction;
                    result += Integer.toString(digit, base);
                    fraction -= digit;
                }

                System.out.println("Результат перевода в указанное основание: " + result);

                double convertedBack = convertBackToDecimal(result, base);
                double error = Math.abs(decimalFraction - convertedBack);

                System.out.println("Погрешность: " + error);
            } else {
                System.out.println("Ошибка: введенное число не является десятичной дробью");
            }

            System.out.println("Продолжить перевод? (да/нет): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("нет")) {
                break;
            }
        }
    }

    public static double convertBackToDecimal(String fraction, int base) {
        String[] parts = fraction.split("\\.");
        String wholePart = parts[0];
        String decimalPart = parts[1];
        double result = Integer.parseInt(wholePart, base);

        for (int i = 0; i < decimalPart.length(); i++) {
            result += Integer.parseInt(String.valueOf(decimalPart.charAt(i)), base) / Math.pow(base, (i + 1));
        }

        return result;
    }
}