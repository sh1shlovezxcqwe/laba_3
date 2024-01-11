import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        int salary = 55000; // ежемесячная зарплата
        int computerCost = 110000; // стоимость компьютера
        int months = 0;
        int quarter = 0;
        int Sum = 55000;
        while (computerCost > Sum) {
            months++;
            if (months % 5 == 0) { // каждый пятый месяц дешевеет
                computerCost *= 0.977; // компьютер дешевеет на 2,3%
            } else if (months % 2 == 0) { // каждый четный месяц дорожает
                computerCost *= 1.0315; // компьютер дорожает на 3,15%
            }
            if (months % 3 == 0) { // каждый квартал увеличивается зарплата
                quarter++;
                salary *= ((1 + 0.05) * quarter); // увеличиваем зарплату на 5% от начальной
            }
            Sum += salary;
        }
        months ++;
        System.out.println("Количество месяцев для покупки компьютера: " + months);
    }
}
