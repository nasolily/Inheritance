public class SalaryWorker extends Worker {
    double annualSalary;

    public SalaryWorker(String john, String doe, String number, String engineer, int i, double v) {
        super(john, doe, number, engineer, i, v);
        this.annualSalary = v;
    }
}