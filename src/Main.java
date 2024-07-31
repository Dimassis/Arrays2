import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Random rand = new Random();
        int [] expensesCompany = new int[5];
        for (int i = 0; i < expensesCompany.length; i++) {
            expensesCompany[i] = rand.nextInt(9000, 15000);
            System.out.println("Неделя " + (i + 1) + ", затраты: " + expensesCompany[i] +
                    " рублей "); // От себя
        }
        int allExpensesCompany = 0;
        for (int i = 0; i < expensesCompany.length; i++) {
            allExpensesCompany += expensesCompany[i];
        }
        System.out.println(allExpensesCompany);

        //Task 2
        System.out.println();
        int maxExpensesCompany = Integer.MIN_VALUE;
        int minExpensesCompany = Integer.MAX_VALUE;
        for(int current : expensesCompany) {
            if(current > maxExpensesCompany) {
                maxExpensesCompany = current;
            }
        }

        for(int current : expensesCompany) {
            if(current < minExpensesCompany) {
                minExpensesCompany = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpensesCompany + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + minExpensesCompany + " рублей.");

        //Task 3
        System.out.println();
        float middleExpensesCompany = 0;
        for (int i = 0; i < expensesCompany.length; i++) {
            middleExpensesCompany += expensesCompany[i];
        }
        System.out.println("Средняя сумма трат за неделю составила " + middleExpensesCompany / expensesCompany.length + " рублей.");

        //Task 4
        System.out.println();
        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v','o','n', 'a', 'v', 'I'};
        // char[] fullName = new char[reserveFullName.length];
            for (int i = 0; i < reserveFullName.length / 2; i++) {
                char z = reserveFullName[i];
                reserveFullName[i] = reserveFullName[reserveFullName.length - i - 1] ;
                reserveFullName[reserveFullName.length - i - 1] = z;
        }
        System.out.println(Arrays.toString(reserveFullName));

    }
}