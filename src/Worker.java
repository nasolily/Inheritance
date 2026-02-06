public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String id,
                  String title, int yob, double hourlyPayRate) {

        super(firstName, lastName, id, title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return (regularHours * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
    }

    public double displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.printf("Weekly Pay for %.2f hours worked: $%.2f%n", hoursWorked, weeklyPay);
        return weeklyPay;
    }

    public String toCSV() {
        return String.format("%s,%s,%s,%s,%d,%.2f",
                getFirstName(), getLastName(), getIDNum(),
                getTitle(), getYOB(), hourlyPayRate);
    }
}