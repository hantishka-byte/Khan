public class User {
    private String name;
    private int age;
    private double weight;
    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
    public void printInfo() {
        System.out.println("User: " + name + ", Age: " + age + ", Weight: " + weight);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return age == other.age &&
                Double.compare(other.weight, weight) == 0 &&
                name.equals(other.name);
    }
}
