import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- USER 1 INPUT --------
        System.out.print("Enter name for user 1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter age for user 1: ");
        int age1 = sc.nextInt();

        System.out.print("Enter weight for user 1: ");
        double weight1 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        User u1 = new User(name1, age1, weight1);

        // -------- USER 2 INPUT --------
        System.out.print("\nEnter name for user 2: ");
        String name2 = sc.nextLine();

        System.out.print("Enter age for user 2: ");
        int age2 = sc.nextInt();

        System.out.print("Enter weight for user 2: ");
        double weight2 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        User u2 = new User(name2, age2, weight2);

        // -------- USER 3 INPUT --------
        System.out.print("\nEnter name for user 3: ");
        String name3 = sc.nextLine();

        System.out.print("Enter age for user 3: ");
        int age3 = sc.nextInt();

        System.out.print("Enter weight for user 3: ");
        double weight3 = sc.nextDouble();

        User u3 = new User(name3, age3, weight3);

        // -------- WORKOUT PLANS --------
        WorkoutPlan w1 = new WorkoutPlan("Chest Day", 60, 500);
        WorkoutPlan w2 = new WorkoutPlan("Leg Day", 45, 450);

        // -------- FITNESS APP --------
        FitnessApp app = new FitnessApp(u1, w1);
        app.showAppInfo();

        // -------- COMPARISONS --------
        System.out.println("u1 = u2? " + u1.equals(u2));
        System.out.println("u1 = u3? " + u1.equals(u3));
        System.out.println("w1 = w2? " + w1.equals(w2));

        sc.close();
    }
}
