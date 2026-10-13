public class Main {
    public static void main(String[] args) {
        Car car = new Car("UAB 001A", 70000, 45000000);
        Motorcycle motorcycle = new Motorcycle("UAB 002A", 18000, 4000000);
        Truck truck = new Truck("UAB 003A", 150000, 80000000);

        Vehicle[] fleet = { car, motorcycle, truck };
        int[] days = { 6 , 3, 2 }; 

        System.out.println("=== FLEET RENTAL RECEIPT ===");
        double combinedTotal = 0;
        for (int i = 0; i < fleet.length; i++) {
            double cost = fleet[i].calculateRentalCost(days[i]); 
            combinedTotal += cost;
            System.out.println(formatReceiptLine(fleet[i], days[i], cost));
        }
        System.out.printf("COMBINED TOTAL = UGX %.2f%n", combinedTotal);

        OfficeBuilding headOffice = new OfficeBuilding(1200000);
        Insurable[] insuredAssets = { car, motorcycle, truck, headOffice };

        System.out.println();
        System.out.println("=== INSURANCE REPORT ===");
        for (Insurable asset : insuredAssets) {
            System.out.println(formatInsuranceLine(asset)); 
        }
    }

    private static String formatReceiptLine(Vehicle v, int days, double cost) {
        String note = "";
        if (v instanceof Car && days >= 7) note = " (7+ day discount applied)";
        if (v instanceof Truck && days < 3) note = " (short-rental surcharge applied)";
        return String.format("%s (%s) x%d days = UGX %.2f%s",
                v.getClass().getSimpleName(), v.getRegNumber(), days, cost, note);
    }

    private static String formatInsuranceLine(Insurable asset) {
        if (asset instanceof OfficeBuilding) {
            return String.format("Head Office Building: UGX %.2f annual insurance (flat premium)",
                    asset.getInsuranceCost());
        }
        Vehicle v = (Vehicle) asset;
        return String.format("%s (%s): UGX %.2f annual insurance",
                v.getClass().getSimpleName(), v.getRegNumber(), asset.getInsuranceCost());
    }
}