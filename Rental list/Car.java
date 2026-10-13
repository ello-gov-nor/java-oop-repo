public class Car extends Vehicle {

    public Car(String regNumber, double dailyRate, double value) {
        super(regNumber, dailyRate, value);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getDailyRate() * days;
        if (days >= 7) {
            cost = cost * 0.90; // Group A: 10% off for 7+ days
        }
        return cost;
    }
}