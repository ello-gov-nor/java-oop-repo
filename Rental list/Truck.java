public class Truck extends Vehicle {

    private static final double SHORT_RENTAL_SURCHARGE = 30000;

    public Truck(String regNumber, double dailyRate, double value) {
        super(regNumber, dailyRate, value);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getDailyRate() * days;
        if (days < 3) {
            cost += SHORT_RENTAL_SURCHARGE; 
        }
        return cost;
    }
}