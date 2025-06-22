import java.util.*;

public class FinancialForecast {

    public static double futureValue(double presentValue, double rate, int years) {

        if (years == 0) {
            return presentValue;
        }

        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double presentValue = sc.nextDouble(); // Starting
        double growthRate = sc.nextDouble(); // percent annual growth
        int years = sc.nextInt(); // 5 years

        double result = futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years = Rs.%.2f\n", years, result);
    }
}
