public class OfficeBuilding implements Insurable {

    private double flatPremium;

    public OfficeBuilding(double flatPremium) {
        this.flatPremium = flatPremium;
    }

    @Override
    public double getInsuranceCost() {
        return flatPremium; 
    }
}