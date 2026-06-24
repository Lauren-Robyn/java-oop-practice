package za.co.wethinkcode.service;

public class StandardTask extends DeliveryTask{

    public StandardTask(String trackingID, double distanceKm) {
        super(trackingID, distanceKm);
    }

    @Override
    public double calculateCost() {
        return getDistanceKm * 15.0;
    }
}
