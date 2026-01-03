import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FitnessApp {
    private List<User> users = new ArrayList<>();
    private List<WorkoutPlan> workouts = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkout(WorkoutPlan workout) {
        workouts.add(workout);
    }

    public void showAppInfo() {
        System.out.println("Fitness App Users:");
        for (User u : users) {
            System.out.println(u);
        }

        System.out.println("\n Fitness App Workout Plans ");
        for (WorkoutPlan w : workouts) {
            System.out.println(w);
        }
        System.out.println("               ");
    }

    // Filtering workouts
    public void filterHighCalories() {
        System.out.println("\n Workouts burning more than 400 calories:");
        workouts.stream().filter(WorkoutPlan::isHighCalorie).forEach(System.out::println);
    }

    // Search user by name
    public void searchUser(String name) {
        System.out.println("\n🔍 Searching user: " + name);
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(name)) {
                System.out.println("Found → " + u);
                return;
            }
        }
        System.out.println("User not found.");
    }

    // Sorting users by weight
    public void sortUsersByWeight() {
        users.sort(Comparator.comparingDouble(User::getWeight));
        System.out.println("\nSorted users by weight:");
        users.forEach(System.out::println);
    }

    // Sorting workouts by duration
    public void sortWorkoutsByDuration() {
        workouts.sort(Comparator.comparingInt(WorkoutPlan::getDurationMinutes));
        System.out.println("\nSorted workouts by duration:");
        workouts.forEach(System.out::println);
    }
}
