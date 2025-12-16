public class Main {
    public static void main(String[] args) {
        User u1 = new User("Michael", 20, 80.5);
        User u2 = new User("Michael", 20, 80.5);
        User u3 = new User("David", 22, 90.0);
        WorkoutPlan w1 = new WorkoutPlan("Chest Day", 60, 500);
        WorkoutPlan w2 = new WorkoutPlan("Leg Day", 45, 450);
        FitnessApp app = new FitnessApp(u1, w1);
        app.showAppInfo();
        System.out.println("u1 = u2? " + u1.equals(u2)); // true
        System.out.println("u1 = u3? " + u1.equals(u3)); // false
        System.out.println("w1 = w2? " + w1.equals(w2)); // false
    }
}
