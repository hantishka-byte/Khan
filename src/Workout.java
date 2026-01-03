public class Workout {
    private String type;
    private int durationMinutes;

    public Workout(String type, int durationMinutes) {
        this.type = type;
        this.durationMinutes = durationMinutes;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    @Override
    public String toString() {
        return "Workout type: " + type + ", Duration: " + durationMinutes + " minutes";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Workout other = (Workout) obj;
        return durationMinutes == other.durationMinutes && type.equals(other.type);
    }

    @Override
    public int hashCode() {
        return type.hashCode() + durationMinutes;
    }
}
