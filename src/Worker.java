public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            return regularPay + overtimePay;
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regHours = Math.min(40, hoursWorked);
        double otHours = Math.max(0, hoursWorked - 40);
        double regPay = regHours * hourlyPayRate;
        double otPay = otHours * (hourlyPayRate * 1.5);

        System.out.printf("Regular: %.1f hrs ($%.2f) | Overtime: %.1f hrs ($%.2f) | Total: $%.2f%n",
                regHours, regPay, otHours, otPay, (regPay + otPay));
    }

    @Override
    public String toCSVDataString() { return super.toCSVDataString() + "," + hourlyPayRate; }
}