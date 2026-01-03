public class WorkoutPlan extends Workout {
    private double caloriesBurned;

    public WorkoutPlan(String type, int durationMinutes, double caloriesBurned) {
        super(type, durationMinutes);
        this.caloriesBurned = caloriesBurned;
    }

    public double getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(double caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    public boolean isHighCalorie() {
        return caloriesBurned > 400;
    }

    @Override
    public String toString() {
        return super.toString() + ", Calories burned: " + caloriesBurned;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        WorkoutPlan other = (WorkoutPlan) obj;
        return Double.compare(caloriesBurned, other.caloriesBurned) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) caloriesBurned;
    }
}
