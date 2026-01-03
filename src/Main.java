import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessApp app = new FitnessApp();

        // Create users from input
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter name for user " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter weight: ");
            double weight = sc.nextDouble();
            sc.nextLine();

            app.addUser(new User(name, age, weight));
        }

        // Add default workouts to pool
        WorkoutPlan w1 = new WorkoutPlan("Chest Day", 60, 500);
        WorkoutPlan w2 = new WorkoutPlan("Leg Day", 45, 450);
        app.addWorkout(w1);
        app.addWorkout(w2);

        // Print data
        app.showAppInfo();

        // Compare objects
        System.out.println("\nCompare workouts (w1 vs w2): " + w1.equals(w2));

        // Filtering & search & sorting
        app.filterHighCalories();

        System.out.print("\nEnter user name to search: ");
        String search = sc.nextLine();
        app.searchUser(search);

        app.sortUsersByWeight();
        app.sortWorkoutsByDuration();

        sc.close();
    }
}
