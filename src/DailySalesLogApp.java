//Siddhartha Kohar - 116234
public class DailySalesLogApp {
    public static void main(String[] args) {
        // 7 days of simulated sales figures
        double[] weeklySalesData = {1200.50, 850.75, 1420.00, 995.30, 2100.45, 1750.20, 1310.90};

        SalesLogger logger = new SalesLogger();
        logger.saveWeeklySales(weeklySalesData, "weekly_sales.txt");
    }
}