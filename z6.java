    import java.util.Scanner;
	class Oblast {
    public static boolean checkPoint(double x, double y) {
        return (isPointInsideSemiCircle(x, y) &&
                (!isPointInsideTriangle1(x, y) && !isPointInsideTriangle2(x, y)) &&
                isPointInsideCircle1(x, y));
    }

    public static boolean isPointInsideSemiCircle(double x, double y) {
        double radius = 6;
        double centerX = 0;
        double centerY = 0;
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
        return (x >= -6 && x <= 6) && (y >= 0 && y <= 6) && (distance <= radius);
    }

    public static boolean isPointInsideTriangle1(double x, double y) {
        double x1 = -1; // x-координата первой вершины треугольника
        double y1 = 0; // y-координата первой вершины треугольника
        double x2 = -4; // x-координата второй вершины треугольника
        double y2 = 0; // y-координата второй вершины треугольника
        double x3 = -4; // x-координата третьей вершины треугольника
        double y3 = 3; // y-координата третьей вершины треугольника

        double area = 0.5 * (-y2 * x3 + y1 * (-x2 + x3) + x1 * (y2 - y3) + x2 * y3);
        double s = 1/(2*area) * (y1*x3 - x1*y3 + (y3-y1)*x + (x1-x3)*y);
        double t = 1/(2*area) * (x1*y2 - y1*x2 + (y1-y2)*x + (x2-x1)*y);

        return (s >= 0 && t >= 0 && (s + t) <= 1);
    }

    public static boolean isPointInsideTriangle2(double x, double y) {
        double x1 = -1; // x-координата первой вершины треугольника
        double y1 = 0; // y-координата первой вершины треугольника
        double x2 = 4; // x-координата второй вершины треугольника
        double y2 = 0; // y-координата второй вершины треугольника
        double x3 = 3; // x-координата третьей вершины треугольника
        double y3 = 3; // y-координата третьей вершины треугольника

        double area = 0.5 * (-y2 * x3 + y1 * (-x2 + x3) + x1 * (y2 - y3) + x2 * y3);
        double s = 1/(2*area) * (y1*x3 - x1*y3 + (y3-y1)*x + (x1-x3)*y);
        double t = 1/(2*area) * (x1*y2 - y1*x2 + (y1-y2)*x + (x2-x1)*y);

        return (s >= 0 && t >= 0 && (s + t) <= 1);
    }

    public static boolean isPointInsideCircle1(double x, double y) {
        double radius1 = 2;
        double radius2 = 1;  // радиус круга
        double centerX1 = 0; // x-координата центра круга
        double centerY1 = 4; // y-координата центра круга

        double distance1 = Math.sqrt(Math.pow(x - centerX1, 2) + Math.pow(y - centerY1, 2));
        if ((distance1 <= radius1) && (distance1 > radius2)) {
            return false;
        } else {
            return true;
        }
    }
}

public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите координату x точки: ");
            double x = scanner.nextDouble();
            System.out.print("Введите координату y точки: ");
            double y = scanner.nextDouble();

            if (Oblast.checkPoint(x, y)) {
                System.out.println("Точка попала в закрашенную часть фигуры");
            } else {
                System.out.println("Точка не попала в закрашенную часть фигуры");
            }

            System.out.print("Желаете проверить еще одну точку? (да/нет): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("нет")) {
                break;
            }
        }
    }
}
