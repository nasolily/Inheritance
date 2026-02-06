public class InheritanceDemo {
    public static void main() {
        SalaryWorker sw = new SalaryWorker("John", "Doe", "123", "Engineer", 1985, 25.0);
        double hoursWorked = 45.0;

        sw.displayWeeklyPay(hoursWorked);
        System.out.println(sw.toCSV());
    }
}
