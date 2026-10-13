public abstract class Vehicle implements Insurable {

    private String regNumber;
    private double dailyRate;
    private double value;

    public Vehicle(String regNumber, double dailyRate, double value) {
        if (dailyRate <= 0 || value <= 0) {
            throw new IllegalArgumentException("Daily rate and value must be greater than zero.");
        }
        this.regNumber = regNumber;
        this.dailyRate = dailyRate;
        this.value = value;
    }

    public String getRegNumber() { return regNumber; }
    public double getDailyRate() { return dailyRate; }
    public double getValue() { return value; }

    
    public abstract double calculateRentalCost(int days);

    
    public void displayDetails() {
        System.out.println("Reg: " + regNumber + ", Daily Rate: UGX " + dailyRate);
    }

    
    @Override
    public double getInsuranceCost() {
        return value * 0.03; 
    }
}