public class WorkoutPlan {
    private String type;
    private int durationMinutes;
    private double caloriesBurned;
    public WorkoutPlan(String type, int durationMinutes, double caloriesBurned) {
        this.type = type;
        this.durationMinutes = durationMinutes;
        this.caloriesBurned = caloriesBurned;
    }
    public String getType() { return type; }
    public int getDurationMinutes() { return durationMinutes; }
    public double getCaloriesBurned() { return caloriesBurned; }
    public void setType(String type) { this.type = type; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
    public void setCaloriesBurned(double caloriesBurned) { this.caloriesBurned = caloriesBurned; }
    public void printPlan() {
        System.out.println("Workout: " + type + " | Duration: " + durationMinutes + " min | Calories: " + caloriesBurned);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WorkoutPlan other = (WorkoutPlan) obj;

        return durationMinutes == other.durationMinutes &&
                Double.compare(other.caloriesBurned, caloriesBurned) == 0 &&
                type.equals(other.type);
    }
}
