public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, annualSalary / 2080);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary / 52;
        System.out.printf("Weekly Pay: $%.2f (Fraction of salary $%.2f)%n", weeklyPay, annualSalary);
    }

    @Override
    public String toCSVDataString() { return super.toCSVDataString() + "," + annualSalary; }
}