public class FitnessApp {
    private User user;
    private WorkoutPlan workoutPlan;
    public FitnessApp(User user, WorkoutPlan workoutPlan) {
        this.user = user;
        this.workoutPlan = workoutPlan;
    }
    public User getUser() { return user; }
    public WorkoutPlan getWorkoutPlan() { return workoutPlan; }
    public void setUser(User user) { this.user = user; }
    public void setWorkoutPlan(WorkoutPlan workoutPlan) { this.workoutPlan = workoutPlan; }
    public void showAppInfo() {
        System.out.println("Fitness App Info:");
        user.printInfo();
        workoutPlan.printPlan();
    }
}
