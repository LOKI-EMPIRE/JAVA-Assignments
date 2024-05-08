package com.examly.springapp.model;

public class Truck {

    private int truckId;
    private String truckCapacity;
    private String truckColor;
    private String geartype;
    
    public Truck(int truckId, String truckCapacity, String truckColor, String geartype) {
        this.truckId = truckId;
        this.truckCapacity = truckCapacity;
        this.truckColor = truckColor;
        this.geartype = geartype;
    }
    public int getTruckId() {
        return truckId;
    }
    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }
    public String getTruckCapacity() {
        return truckCapacity;
    }
    public void setTruckCapacity(String truckCapacity) {
        this.truckCapacity = truckCapacity;
    }
    public String getTruckColor() {
        return truckColor;
    }
    public void setTruckColor(String truckColor) {
        this.truckColor = truckColor;
    }
    public String getGeartype() {
        return geartype;
    }
    public void setGeartype(String geartype) {
        this.geartype = geartype;
    }

}
