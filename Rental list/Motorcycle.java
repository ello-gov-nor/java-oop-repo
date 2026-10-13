public class Motorcycle extends Vehicle {

    public Motorcycle(String regNumber, double dailyRate, double value) {
        super(regNumber, dailyRate, value);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getDailyRate() * days; // no deal, ever
    }
}