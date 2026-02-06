import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 Workers
        workers.add(new Worker("John", "Smith", "001", "Mr.", 1990, 20.0));
        workers.add(new Worker("Jane", "Doe", "002", "Ms.", 1985, 25.50));
        workers.add(new Worker("Bob", "Builder", "003", "Mr.", 1970, 30.0));

        // Create 3 SalaryWorkers
        workers.add(new SalaryWorker("Alice", "Wonder", "004", "Dr.", 1992, 52000));
        workers.add(new SalaryWorker("Charlie", "Brown", "005", "Mr.", 1950, 78000));
        workers.add(new SalaryWorker("Diana", "Prince", "006", "Hon.", 1980, 104000));

        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("\n--- WEEK " + (week + 1) + " (" + weeklyHours[week] + " hrs) ---");
            System.out.printf("%-10s %-7s %-20s %-13s %-40s%n", "ID", "Title", "Name", "YOB", "Pay Details");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
            for (Worker w : workers) {
                System.out.printf("%-10s %-7s %-20s %-13s ",  w.getIDNum(), w.getTitle(), w.fullName(), w.getYOB());
                w.displayWeeklyPay(weeklyHours[week]);
            }
        }
    }
}