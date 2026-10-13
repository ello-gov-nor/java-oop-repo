// extends and super


public class Animal {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Animal() {
        this.name = "Unknown";
        this.species = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, String species,
            int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String s) {
        this.species = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException(
                    "Weight must be greater than zero");
        }
        this.weight = weight;
    }

    public void describe() {
        System.out.println(name + " is a " + species +
                ", age " + age + ", weight " + weight + "kg");
    }





}






