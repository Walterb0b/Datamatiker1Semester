package Lesson14.Comparator;

// Fish class with name and weight
class Fish {
    private String name;
    private double weight; // in kg

    public Fish(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
