package za.co.wethinkcode.service;

import java.util.ArrayList;
import java.util.List;

public abstract class DeliveryTask {
    private String trackingID;
    private double distanceKm;
    private List<String> checkpoints;


    public DeliveryTask(String trackingID, double distanceKm){
        if(trackingID == null || trackingID.isEmpty()){
            throw new IllegalArgumentException();
        }
        if(distanceKm <= 0){
            throw new IllegalArgumentException();
        }
        this.checkpoints = new ArrayList<>();
    }


    public String getTrackingID() {
        return trackingID;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void addCheckpoint(String checkpoint){
        if (checkpoint == null || checkpoint.isEmpty()){
            throw new IllegalArgumentException();
        }else{
            checkpoints.add(checkpoint);
        }
    }

    public List<String> getCheckpoints() {
        return new ArrayList<>(checkpoints);
    }

    public abstract double calculateCost();
}
